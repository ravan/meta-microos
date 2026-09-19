SUMMARY = "AWS Java SDK for Auto Scaling"
DESCRIPTION = "The AWS Java SDK for Auto Scaling module holds the \
client classes that are used for communicating with \
Auto Scaling Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-autoscaling-1.11.3-12.2.noarch.rpm"
RPM_HASH = "913376d4cb1a4595cf513837c1cd8db14c3df03a7030e2602d06cabc1870a9de698110f870337c90eb919161a6d50b5b8384eb108b59a0dfab784b7360ed6782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-autoscaling \
mvn-com.amazonaws-aws-java-sdk-autoscaling \
mvn-com.amazonaws-aws-java-sdk-autoscaling-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
