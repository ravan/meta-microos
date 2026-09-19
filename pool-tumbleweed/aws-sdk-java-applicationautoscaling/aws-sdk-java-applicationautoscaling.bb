SUMMARY = "AWS Java SDK for AWS Application Auto Scaling"
DESCRIPTION = "The AWS Java SDK for AWS Application Auto Scaling module \
holds the client classes that are used for communicating \
with AWS Application Auto Scaling service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-applicationautoscaling-1.11.3-12.2.noarch.rpm"
RPM_HASH = "61e0f7b94c247733ef239e56fc378c1df547bff0df0e186b336b1091f3e294fcdd3cdb6e2faedd184adb6132552781e0a78a2058eff5fe21b3eedcf948505365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-applicationautoscaling \
mvn-com.amazonaws-aws-java-sdk-applicationautoscaling \
mvn-com.amazonaws-aws-java-sdk-applicationautoscaling-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
