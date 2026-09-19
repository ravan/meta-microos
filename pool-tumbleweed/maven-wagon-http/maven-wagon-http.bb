SUMMARY = "The http module for maven-wagon"
DESCRIPTION = "The http module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-3.5.3-2.9.noarch.rpm"
RPM_HASH = "af785551e8b9e5d70cfd73d4b56335b1bc2e09e26746d22531bc82a873211d0e42f7078503aa94754559693f54d8410cc1f1101f9d95977af3730a22702e94e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http \
mvn-org.apache.maven.wagon-wagon-http \
mvn-org.apache.maven.wagon-wagon-http--shaded- \
mvn-org.apache.maven.wagon-wagon-http-pom- \
mvn-org.apache.maven.wagon-wagon-http-pom-shaded-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.maven.wagon-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.slf4j-jcl-over-slf4j"

inherit rpm
