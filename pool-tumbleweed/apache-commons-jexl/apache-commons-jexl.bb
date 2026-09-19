SUMMARY = "Java Expression Language (JEXL)"
DESCRIPTION = "Java Expression Language (JEXL) is an expression language engine which can be \
embedded in applications and frameworks.  JEXL is inspired by Jakarta Velocity \
and the Expression Language defined in the JavaServer Pages Standard Tag \
Library version 1.1 (JSTL) and JavaServer Pages version 2.0 (JSP).  While \
inspired by JSTL EL, it must be noted that JEXL is not a compatible \
implementation of EL as defined in JSTL 1.1 (JSR-052) or JSP 2.0 (JSR-152). \
For a compatible implementation of these specifications, see the Commons EL \
project. \
 \
JEXL attempts to bring some of the lessons learned by the Velocity community \
about expression languages in templating to a wider audience.  Commons Jelly \
needed Velocity-ish method access, it just had to have it."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-jexl-2.1.1-4.8.noarch.rpm"
RPM_HASH = "f505a4cc28e1539c933d8197468b462d3012b9023d786e7943eaba87b4abecb1060c19dc1b9d02e1ddf9c0a464860fa36bb856933c77a0c97f5ceafe435ca4bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jexl \
commons-jexl \
mvn-org.apache.commons-commons-jexl \
mvn-org.apache.commons-commons-jexl-compat \
mvn-org.apache.commons-commons-jexl-compat-pom- \
mvn-org.apache.commons-commons-jexl-pom- \
osgi-org.apache.commons.commons-jexl \
osgi-org.apache.commons.commons-jexl-compat"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
