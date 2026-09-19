SUMMARY = "AWS Java SDK for the Amazon EC2 Container Service"
DESCRIPTION = "The AWS Java SDK for the Amazon EC2 Container Service \
holds the client classes that are used for communicating \
with the Amazon EC2 Container Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ecs-1.11.3-12.2.noarch.rpm"
RPM_HASH = "59ff44aecaff3c3c1f983accb5ce9edfc29c1697c4456f9fa8be5b938be54b7563057ee44011d0c829fefd14e9f236165c7e7b7e82015c20d5d50a16ef22a67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ecs \
mvn-com.amazonaws-aws-java-sdk-ecs \
mvn-com.amazonaws-aws-java-sdk-ecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
