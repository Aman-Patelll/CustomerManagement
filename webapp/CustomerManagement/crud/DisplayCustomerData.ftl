<#if parameters.customerlist?? && parameters.customerlist?size gt 0>
    <table border="1" cellspacing="0" cellpadding="8">
        <tr>
            <th>Party Id</th>
            <th>Email Address</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Contact Number</th>
            <th>To Name</th>
            <th>Attn Name</th>
            <th>Address</th>
            <th>City</th>
            <th>Postal Code</th>
        </tr>
        <#list parameters.customerlist as customer>
            <tr>
                <td>${customer.partyId!''}</td>
                <td>${customer.infoString!''}</td>
                <td>${customer.firstName!''}</td>
                <td>${customer.lastName!''}</td>
                <td>${customer.contactNumber!''}</td>
                <td>${customer.toName!''}</td>
                <td>${customer.attnName!''}</td>
                <td>${customer.address1!''}</td>
                <td>${customer.city!''}</td>
                <td>${customer.postalCode!''}</td>
            </tr>
        </#list>
    </table>
    <#else>
        <p>Customer Not Found</p>
</#if>