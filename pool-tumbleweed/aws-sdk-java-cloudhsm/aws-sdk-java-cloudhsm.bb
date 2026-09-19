SUMMARY = "AWS Java SDK for the AWS CloudHSM"
DESCRIPTION = "The AWS Java SDK for AWS CloudHSM holds the client \
classes that are used for communicating with the \
AWS CloudHSM Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudhsm-1.11.3-12.2.noarch.rpm"
RPM_HASH = "39cd280ccf66f3a66039579d945bd521c9a2fabfd492690cb623026afe3f0e9f03c53f4bcc58c3fa8f5093c86d7cb12d9b23a80d760d8b809c97ea019941a9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudhsm \
mvn-com.amazonaws-aws-java-sdk-cloudhsm \
mvn-com.amazonaws-aws-java-sdk-cloudhsm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
