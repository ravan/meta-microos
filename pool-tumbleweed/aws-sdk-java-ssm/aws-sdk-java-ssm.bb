SUMMARY = "AWS Java SDK for the AWS Simple Systems Management (SSM) Service"
DESCRIPTION = "The AWS Java SDK for AWS Simple Systems Management Service \
holds the client classes that are used for communicating \
with the AWS Simple Systems Management Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ssm-1.11.3-12.2.noarch.rpm"
RPM_HASH = "31e664407c220ced90cd9e335837b0786b3141d589686f0662293e1a2945aa1ddca049d5083190868cbb9a277116b3f63b89578b6f03ce0a945569267f8a37ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ssm \
mvn-com.amazonaws-aws-java-sdk-ssm \
mvn-com.amazonaws-aws-java-sdk-ssm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
