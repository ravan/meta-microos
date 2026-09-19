SUMMARY = "AWS Java SDK for the Amazon EC2 Container Registry"
DESCRIPTION = "The AWS Java SDK for the Amazon EC2 Container Registry \
holds the client classes that are used for communicating \
with the Amazon EC2 Container Registry Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ecr-1.11.3-12.2.noarch.rpm"
RPM_HASH = "6cb814e392a9da712fedffc7f2a9d407ed245e1360d221c3ab83ce6470d6fc9755d5ea93c23c42caa00f6ef59584ac09f6d88dd3b7e52251e8754954ffebc3fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ecr \
mvn-com.amazonaws-aws-java-sdk-ecr \
mvn-com.amazonaws-aws-java-sdk-ecr-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
