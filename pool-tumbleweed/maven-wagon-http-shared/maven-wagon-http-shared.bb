SUMMARY = "The http-shared module for maven-wagon"
DESCRIPTION = "The http-shared module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-shared-3.5.3-2.9.noarch.rpm"
RPM_HASH = "32e8e1668bdffb36d27740ec3927bb5f33f1ff1027c9e3afe25e9674b50bf7f6577125d2f3a416f1111e5f0ff4036438e7082b62dcab789abd031eb75ebaa334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-http-shared-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api"

inherit rpm
