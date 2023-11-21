rootProject.name = "blog-backend"
include("client-libs:keycloak")
findProject(":client-libs:keycloak")?.name = "keycloak"

