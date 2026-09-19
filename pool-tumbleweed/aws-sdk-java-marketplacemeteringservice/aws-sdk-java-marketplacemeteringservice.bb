SUMMARY = "AWS Java SDK for AWS Marketplace Metering Service"
DESCRIPTION = "The AWS Java SDK for AWS Marketplace Metering Service module \
holds the client classes that are used for communicating with \
AWS Marketplace Metering Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-marketplacemeteringservice-1.11.3-12.2.noarch.rpm"
RPM_HASH = "30833ac37731123b15a854923c3489862c88f9f5d3b328e37464f54e1d2eb0ff66a3038698811761f14b1f14506c80b9f011ff67efe6075fe572c3dc368949d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-marketplacemeteringservice \
mvn-com.amazonaws-aws-java-sdk-marketplacemeteringservice \
mvn-com.amazonaws-aws-java-sdk-marketplacemeteringservice-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
