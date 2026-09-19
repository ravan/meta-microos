SUMMARY = "The http-lightweight module for maven-wagon"
DESCRIPTION = "The http-lightweight module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-lightweight-3.5.3-2.9.noarch.rpm"
RPM_HASH = "0c2ace13df70b1af332cff47274b083abeeec26149fe316cb3bb5ee406b8933f0e9e28dc2be833219ef2e1c298fb87966fba7e82af2ad62523c99e5c03c57069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http-lightweight \
mvn-org.apache.maven.wagon-wagon-http-lightweight \
mvn-org.apache.maven.wagon-wagon-http-lightweight-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
