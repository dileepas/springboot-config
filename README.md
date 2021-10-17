Test

**Azure app service Environment Variables**

AZURE_MYSQL_SERVER_NAME
AZURE_MYSQL_DB
AZURE_MYSQL_USERNAME
AZURE_MYSQL_PASSWORD

**Create todo example**

curl --header "Content-Type: application/json" \
--request POST \
--data '{"description":"new Task","assignee":"new member","done": "true"}' \
https://itechro-demo.azurewebsites.net/todo




