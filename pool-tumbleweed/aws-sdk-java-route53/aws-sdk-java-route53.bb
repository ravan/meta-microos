SUMMARY = "AWS Java SDK for Amazon Route53"
DESCRIPTION = "The AWS Java SDK for Amazon Route53 module holds the \
client classes that are used for communicating with \
Amazon Route53 Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-route53-1.11.3-12.2.noarch.rpm"
RPM_HASH = "06373f0839cf617ee3d8f350b619b5f022e8c3ded4ead6ea9d88d2ddb2eb33bc3c2244e2d2315210144dfb60f9593e5888d8d9989a057d019177188bbef93bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-route53 \
mvn-com.amazonaws-aws-java-sdk-route53 \
mvn-com.amazonaws-aws-java-sdk-route53-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
