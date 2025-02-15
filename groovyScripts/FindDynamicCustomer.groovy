import org.apache.ofbiz.entity.Delegator
import org.apache.ofbiz.entity.DelegatorFactory
import org.apache.ofbiz.entity.GenericEntityException
import org.apache.ofbiz.entity.util.EntityQuery
import org.apache.ofbiz.entity.condition.EntityCondition
import org.apache.ofbiz.entity.condition.EntityOperator
import org.apache.ofbiz.base.util.Debug


def FindCustomerDetail() {
    Debug.logInfo("Fetching Customer list...", "CustomerService")

    if (context == null) {
        context = [:]
    }

    Delegator delegator = (Delegator) context.get("delegator") ?: DelegatorFactory.getDelegator("default")

    String partyId = context.get("partyId")
    String infoString = context.get("infoString")
    String combinedName = context.get("combinedName")
    String firstName = context.get("firstName")
    String lastName = context.get("lastName")
    String contactNumber = context.get("contactNumber")
    String toName = context.get("toName")
    String attnName = context.get("attnName")
    String address = context.get("address")
    String city = context.get("city")
    String postalCode = context.get("postalCode")

    List customerlist = []
    List<EntityCondition> conditions = []

    try {
        if (partyId) {
            conditions.add(EntityCondition.makeCondition("partyId", EntityOperator.EQUALS, partyId))
        }

        if (infoString) {
            conditions.add(EntityCondition.makeCondition("infoString", EntityOperator.LIKE, "%" + infoString + "%"))
        }

        if (combinedName) {
            conditions.add(EntityCondition.makeCondition("combinedName", EntityOperator.LIKE, "%" + combinedName + "%"))
        }

        if (firstName) {
            conditions.add(EntityCondition.makeCondition("firstName", EntityOperator.LIKE, "%" + firstName + "%"))
        }

        if (lastName) {
            conditions.add(EntityCondition.makeCondition("lastName", EntityOperator.LIKE, "%" + lastName + "%"))
        }

        if (contactNumber) {
            conditions.add(EntityCondition.makeCondition("contactNumber", EntityOperator.LIKE, "%" + contactNumber + "%"))
        }

        if (toName) {
            conditions.add(EntityCondition.makeCondition("toName", EntityOperator.LIKE, "%" + toName + "%"))
        }

        if (attnName) {
            conditions.add(EntityCondition.makeCondition("attnName", EntityOperator.LIKE, "%" + attnName + "%"))
        }

        if (address) {
            conditions.add(EntityCondition.makeCondition("address", EntityOperator.LIKE, "%" + address + "%"))
        }

        if (city) {
            conditions.add(EntityCondition.makeCondition("city", EntityOperator.LIKE, "%" + city + "%"))
        }

        if (postalCode) {
            conditions.add(EntityCondition.makeCondition("postalCode", EntityOperator.LIKE, "%" + postalCode + "%"))
        }

        def query = EntityQuery.use(delegator).from("FindCustomerView")

        if (!conditions.isEmpty()) {
            query = query.where(EntityCondition.makeCondition(conditions, EntityOperator.AND))
        }

        customerlist = query.queryList()
    }
    catch (GenericEntityException e) {
        Debug.logError("Error in FindCustomerDetail service: " + e, "CustomerService")
    }

    Debug.logInfo("Customer List Before Setting in Context: " + customerlist, "CustomerService")

    context.customerlist = customerlist ?: []  
    
    Debug.logInfo("Customer List After Setting in Context: " + context.customerlist, "CustomerService")
    
    return context;
}
