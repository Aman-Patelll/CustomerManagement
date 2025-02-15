<form method="post" action="<@ofbizUrl>FindDynamicCustomer</@ofbizUrl>" name="AddCustomer" class="form-horizontal">

    <div class="control-group">
        <label class="control-label" for="partyId">Party Id</label>
        <div class="controls">
            <input type="text" id="partyId" name="partyId">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="infoString">Email Address</label>
        <div class="controls">
            <input type="text" id="infoString" name="infoString">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="firstName">First Name</label>
        <div class="controls">
            <input type="text" id="firstName" name="firstName">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="lastName">Last Name</label>
        <div class="controls">
            <input type="text" id="lastName" name="lastName">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="contactNumber">Contact Number</label>
        <div class="controls">
            <input type="text" id="contactNumber" name="contactNumber">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="toName">To Name</label>
        <div class="controls">
            <input type="text" id="toName" name="toName">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="address1">Address 1</label>
        <div class="controls">
            <input type="text" id="address1" name="address1">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="city">City</label>
        <div class="controls">
            <input type="text" id="city" name="city">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="postalCode">PostalCode</label>
        <div class="controls">
            <input type="text" id="postalCode" name="postalCode">
        </div>
    </div>

    <div class="control-group">
        <div class="controls">
            <button type="submit" class="btn">${uiLabelMap.CommonAdd}</button>
        </div>
    </div>

</form>