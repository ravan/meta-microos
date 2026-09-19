SUMMARY = "AWS Java SDK for AWS CodeDeploy"
DESCRIPTION = "The AWS Java SDK for AWS CodeDeploy module holds the \
client classes that are used for communicating with \
AWS CodeDeploy Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codedeploy-1.11.3-12.2.noarch.rpm"
RPM_HASH = "371cc2c9a53f742f2b7c6d4d49b9fc992c5ce594ab7ce9a99992528bfe812ea9507d3de4d03e4d78d7f976bccda93091d139b369d6390e9e080b8ef9b63e15dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codedeploy \
mvn-com.amazonaws-aws-java-sdk-codedeploy \
mvn-com.amazonaws-aws-java-sdk-codedeploy-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
