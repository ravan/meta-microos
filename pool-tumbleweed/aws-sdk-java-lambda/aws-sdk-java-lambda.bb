SUMMARY = "AWS Java SDK for AWS Lambda"
DESCRIPTION = "The AWS Java SDK for AWS Lambda module holds the \
client classes that are used for communicating with \
AWS Lambda Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-lambda-1.11.3-12.2.noarch.rpm"
RPM_HASH = "ea4380e600d7d57a3639806e7ea69d498f0bb9faca0e2f36e6d71264c5854809b98ef9a2e990b16fd233f56a4a8e612599ce7e038a19d9dd20851bdb5ebf9c59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-lambda \
mvn-com.amazonaws-aws-java-sdk-lambda \
mvn-com.amazonaws-aws-java-sdk-lambda-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
