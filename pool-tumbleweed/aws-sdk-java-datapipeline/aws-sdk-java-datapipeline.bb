SUMMARY = "AWS Java SDK for AWS Data Pipeline"
DESCRIPTION = "The AWS Java SDK for AWS Data Pipeline module holds the \
client classes that are used for communicating with \
AWS Data Pipeline Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-datapipeline-1.11.3-12.2.noarch.rpm"
RPM_HASH = "e1cd0860de117682cf391669854c30c3a1a79f8b611a4a54e8d81afd4e8df5300d7558d043e09b51738334a2c0434ed039876a2e393498e666664f54df31f9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-datapipeline \
mvn-com.amazonaws-aws-java-sdk-datapipeline \
mvn-com.amazonaws-aws-java-sdk-datapipeline-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
