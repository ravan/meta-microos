SUMMARY = "AWS Java SDK for Amazon SNS"
DESCRIPTION = "The AWS Java SDK for Amazon SNS module holds the \
client classes that are used for communicating with \
Amazon Simple Notification Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sns-1.11.3-12.2.noarch.rpm"
RPM_HASH = "65dd438cc7032cda5cb1a936a06f5fd06c0f53bef63a8936b6ae57392363aff97e806b7c72a456db9811f104ba658f35eb700e7b7ad49400eb534c1a430e6c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sns \
mvn-com.amazonaws-aws-java-sdk-sns \
mvn-com.amazonaws-aws-java-sdk-sns-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-sqs"

inherit rpm
