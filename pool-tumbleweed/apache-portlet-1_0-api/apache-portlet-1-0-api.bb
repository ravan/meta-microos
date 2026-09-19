SUMMARY = "Portlet API 1.0 from Jetspeed2"
DESCRIPTION = "Java Standard Portlet API accoring to JSR-168, from Jetspeed-2 ."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "apache-portlet-1_0-api-1.0-114.9.noarch.rpm"
RPM_HASH = "c1abec21c31c2ff942c5452818eca2c17854c5fd3b9cc40e4a82b45d7fd4aea0198897e2e26475d9c14a054daa6256e4f7d7deaab150c0a97f4af20e3ece0d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-portlet-1-0-api \
mvn-javax.portlet-portlet-api \
mvn-javax.portlet-portlet-api-pom- \
portlet \
portlet-1.0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
