SUMMARY = "AWS Java SDK for Amazon S3"
DESCRIPTION = "The AWS Java SDK for Amazon S3 module holds the \
client classes that are used for communicating with \
Amazon Simple Storage Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-s3-1.11.3-12.2.noarch.rpm"
RPM_HASH = "6d8ae17b0e598c27932fc03417164903bb4a9bce5f93949727081da501a194affdc27c2e9432c17e99dcd42650f0bacb471d03610cc787a5c7d609dfd97baea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-s3 \
mvn-com.amazonaws-aws-java-sdk-s3 \
mvn-com.amazonaws-aws-java-sdk-s3-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-kms"

inherit rpm
