SUMMARY = "AWS Java SDK for Amazon Cognito Identity"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Identity module holds the \
client classes that are used for communicating with \
Amazon Cognito Identity Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitoidentity-1.11.3-12.2.noarch.rpm"
RPM_HASH = "adb501d2a4ab3003a8ee6fc1ca488ac7c1cb0acf53954357b91efa948743e013ee253130c735dcc7aa72592087afea70df1dd3b03098d04bebfb79a3c31bc667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
