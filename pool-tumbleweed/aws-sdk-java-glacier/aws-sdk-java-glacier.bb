SUMMARY = "AWS Java SDK for Amazon Glacier"
DESCRIPTION = "The AWS Java SDK for Amazon Glacier module holds the \
client classes that are used for communicating with \
Amazon Glacier Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-glacier-1.11.3-12.2.noarch.rpm"
RPM_HASH = "4e8e05ea9e2897575ac35296c1aa300239244370914791300cbb3a4c85db781123c3d2bb98234baa990d049c10b63806cc87c2ee7dab6aaec42104bb71b80a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-glacier \
mvn-com.amazonaws-aws-java-sdk-glacier \
mvn-com.amazonaws-aws-java-sdk-glacier-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-s3 \
mvn-com.amazonaws-aws-java-sdk-sns \
mvn-com.amazonaws-aws-java-sdk-sqs"

inherit rpm
