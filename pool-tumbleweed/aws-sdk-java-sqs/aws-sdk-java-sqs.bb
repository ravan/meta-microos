SUMMARY = "AWS Java SDK for Amazon SQS"
DESCRIPTION = "The AWS Java SDK for Amazon SQS module holds the \
client classes that are used for communicating with \
Amazon Simple Queue Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sqs-1.11.3-12.2.noarch.rpm"
RPM_HASH = "b051d771dc61a56900886685d55a6ee452d2c3b68cbe7690ce5bfd04bd8e449a8d17388cdc9be334c38d9ee2fb9f0b11de6d5d0314f2dc27859f054039603b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sqs \
mvn-com.amazonaws-aws-java-sdk-sqs \
mvn-com.amazonaws-aws-java-sdk-sqs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
