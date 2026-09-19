SUMMARY = "AWS Java SDK for AWS IAM"
DESCRIPTION = "The AWS Java SDK for AWS IAM module holds the \
client classes that are used for communicating with \
AWS Identity and Access Management Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-iam-1.11.3-12.2.noarch.rpm"
RPM_HASH = "b681b2b1c8f3655a8e4090d8d3084dbf6cc596a34ccc599fc4f526656db53af1d07154012c6ccbce9ac36fdb0cf70f94674a943f229f4ff526f522839c7a3bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-iam \
mvn-com.amazonaws-aws-java-sdk-iam \
mvn-com.amazonaws-aws-java-sdk-iam-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
