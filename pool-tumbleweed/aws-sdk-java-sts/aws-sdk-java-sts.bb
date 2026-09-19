SUMMARY = "AWS Java SDK for AWS STS"
DESCRIPTION = "The AWS Java SDK for AWS STS module holds the \
client classes that are used for communicating with \
AWS Security Token Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sts-1.11.3-12.2.noarch.rpm"
RPM_HASH = "556618c2595ff59d1389a2a07c0b73a2eb40bd367a2bda1ca2f28bd537cde56da72c485b2816b6e88a85012f7281fe080d17add089bff3fee5a240d421c83ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sts \
mvn-com.amazonaws-aws-java-sdk-sts \
mvn-com.amazonaws-aws-java-sdk-sts-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
