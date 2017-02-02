<div>
    <div>
        <h1>${model.userDetails.name!}</h1>
        ${model.userDetails.birthday}  ${model.userDetails.id}
    </div>

    <div>
    <#list model.records>
        <table>
            <#items as record>
                <tr>
                    <td>${record.id}</td>
                    <td>${record.text}</td>
                    <td>${record.created}</td>
                </tr>
            </#items>
        </table>
    </#list>
    </div>

</div>