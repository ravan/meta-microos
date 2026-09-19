SUMMARY = "CloudWatch Metrics for AWS Java SDK"
DESCRIPTION = "This package holds the classes for uploading the \
client side metrics collected from AWS Java SDK to \
Amazon CloudWatch."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudwatchmetrics-1.11.3-12.2.noarch.rpm"
RPM_HASH = "2efa3eb76f990a69daacb43fa29512157f1289b94148cbabc5f4adf00b22d8e72e6af8c868a02c4598d5c9716529165560fcda5369d153eee4fdf742780882a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudwatchmetrics \
mvn-com.amazonaws-aws-java-sdk-cloudwatchmetrics \
mvn-com.amazonaws-aws-java-sdk-cloudwatchmetrics-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-dynamodb"

inherit rpm
