SUMMARY = "AWS SDK for Java - Core"
DESCRIPTION = "The AWS SDK for Java - Core module holds the classes that \
is used by the individual service clients to interact with \
Amazon Web Services. Users need to depend on aws-java-sdk \
artifact for accessing individual client classes."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-core-1.11.3-12.2.noarch.rpm"
RPM_HASH = "8068398d0cf050a5b698b2ac89a47ec23e8b92262342e7e2c02e73431ed76c7450c8f7a9d0592c55ccf854b66ac1a26e8ef62fabdd1ca592c3ef305fb4800b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-core \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor \
mvn-commons-logging-commons-logging \
mvn-javax.xml.bind-jaxb-api \
mvn-joda-time-joda-time \
mvn-org.apache.httpcomponents-httpclient"

inherit rpm
