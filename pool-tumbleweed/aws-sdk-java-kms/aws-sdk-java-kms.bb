SUMMARY = "AWS Java SDK for AWS KMS"
DESCRIPTION = "The AWS Java SDK for AWS KMS module holds the \
client classes that are used for communicating with \
AWS Key Management Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-kms-1.11.3-12.2.noarch.rpm"
RPM_HASH = "91f6b5a30253bc4e5b97705d4bbea2faca04d789ae795a0740a6db69c34b5e0dd5a5a5eac8ae898ca3c5e5e23306ce01ce9837707417247df9fea6bb048eb786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-kms \
mvn-com.amazonaws-aws-java-sdk-kms \
mvn-com.amazonaws-aws-java-sdk-kms-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
