SUMMARY = "AWS Java SDK for Amazon Cognito Sync"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Sync module holds the \
client classes that are used for communicating with \
Amazon Cognito Sync Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitosync-1.11.3-12.2.noarch.rpm"
RPM_HASH = "3b0273e7c90c5441b58d4659f157f555ba452faf593a4f92763734790b4340bdddfbb3674ef5c11f5d2856aacac6788fdbac5032c782566dabed27eda48c4033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitosync \
mvn-com.amazonaws-aws-java-sdk-cognitosync \
mvn-com.amazonaws-aws-java-sdk-cognitosync-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
