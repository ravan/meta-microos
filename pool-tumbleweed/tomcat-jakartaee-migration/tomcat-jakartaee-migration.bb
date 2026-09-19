SUMMARY = "Tomcat JakartaEE Migration"
DESCRIPTION = "The purpose of the tool is to take a web application written for \
Java EE 8 that runs on Apache Tomcat 9 and convert it automatically \
so it runs on Apache Tomcat 10 which implements Jakarta EE 9. \
 \
The tool can be used from the command line or as an Ant task."
LICENSE = "Apache-2.0"

PV = "1.0.7"

RPM_NAME = "tomcat-jakartaee-migration-1.0.7-1.13.noarch.rpm"
RPM_HASH = "c0ba856012964d73c711678090ebdb4be5f0aa47b8c7b7e3ecee319013c57a3d31367db534688cb7bd1721599560ae3120e526c770dd5d6f5effcbed1cc4feef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat-jakartaee-migration \
mvn-org.apache.tomcat-jakartaee-migration-pom- \
tomcat-jakartaee-migration"

RDEPENDS:${PN} += "/usr/bin/bash \
bcel \
commons-compress \
commons-io \
commons-lang3 \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-commons-io-commons-io \
mvn-org.apache.bcel-bcel \
mvn-org.apache.commons-commons-compress"

inherit rpm
