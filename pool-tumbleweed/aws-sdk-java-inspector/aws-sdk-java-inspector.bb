SUMMARY = "AWS Java SDK for Amazon Inspector Service"
DESCRIPTION = "The AWS Java SDK for Amazon Inspector Service module \
holds the client classes that are used for communicating with \
Amazon Inspector Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-inspector-1.11.3-12.2.noarch.rpm"
RPM_HASH = "3a27b83aafad9f764cc05bb4ee75697201be48616221b33f00486bec0713edb856d584bd8968a5bc12a5322f2e0f0a962bbc5248cbc92469cab6cef0c86aa4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-inspector \
mvn-com.amazonaws-aws-java-sdk-inspector \
mvn-com.amazonaws-aws-java-sdk-inspector-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
