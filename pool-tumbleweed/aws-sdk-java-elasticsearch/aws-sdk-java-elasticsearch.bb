SUMMARY = "AWS Java SDK for Amazon Elasticsearch Service"
DESCRIPTION = "The AWS Java SDK for Amazon Elasticsearch Service module \
holds the client classes that are used for communicating \
with Amazon Elasticsearch Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticsearch-1.11.3-12.2.noarch.rpm"
RPM_HASH = "28dfb97607d109513784f590c889ad4b771fa89f70b89952d0dc178515bcdc5052ada20b556309e5acf6ee4c298e72b428f5491d859732ea7623f9f71cd8902f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticsearch \
mvn-com.amazonaws-aws-java-sdk-elasticsearch \
mvn-com.amazonaws-aws-java-sdk-elasticsearch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
