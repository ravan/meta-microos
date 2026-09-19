SUMMARY = "AWS Java SDK for AWS Storage Gateway"
DESCRIPTION = "The AWS Java SDK for AWS Storage Gateway module holds the \
client classes that are used for communicating with \
AWS Storage Gateway Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-storagegateway-1.11.3-12.2.noarch.rpm"
RPM_HASH = "f97a0b90835e4dce58ba8419af113c2cbc0e0198f39942eadcaa13e648b8fb48399410bb174ee2b4c90bcd4bc2d0c017bb688afd839ab0cb7bd32226251c7b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-storagegateway \
mvn-com.amazonaws-aws-java-sdk-storagegateway \
mvn-com.amazonaws-aws-java-sdk-storagegateway-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
