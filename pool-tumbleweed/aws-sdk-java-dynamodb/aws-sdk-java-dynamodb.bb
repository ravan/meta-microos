SUMMARY = "AWS Java SDK for Amazon DynamoDB"
DESCRIPTION = "The AWS Java SDK for Amazon DynamoDB module holds the \
client classes that are used for communicating with \
Amazon DynamoDB Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-dynamodb-1.11.3-12.2.noarch.rpm"
RPM_HASH = "23fa85a651bda640f5874d349802e1e1ee34fa185f9be998fb9924e5b3621462c96f1d83fbaf0932de07d0def82c756cf971fe0fb1428ad4e9f28bfda5ae676a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-dynamodb \
mvn-com.amazonaws-aws-java-sdk-dynamodb \
mvn-com.amazonaws-aws-java-sdk-dynamodb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-s3"

inherit rpm
