<div>
    <div>
        <h1>${userDetails.name}</h1>
        ${userDetails.birthday}  ${userDetails.id}
    </div>

    <div>
    <#list records>
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