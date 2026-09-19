SUMMARY = "AWS Java SDK for Amazon EMR"
DESCRIPTION = "The AWS Java SDK for Amazon EMR module holds the \
client classes that are used for communicating \
with Amazon Elastic MapReduce Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-emr-1.11.3-12.2.noarch.rpm"
RPM_HASH = "a7adffa5ddca4deabe8641ebcf9f13adc10f94d0a1e0414e0001357ce06a7d01bf8d89c69af33dccc66f6df51bc7245131c472105e25f2e9f49ebc9479e9c88c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-emr \
mvn-com.amazonaws-aws-java-sdk-emr \
mvn-com.amazonaws-aws-java-sdk-emr-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
