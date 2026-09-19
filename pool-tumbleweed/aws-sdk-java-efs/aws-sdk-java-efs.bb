SUMMARY = "AWS Java SDK for Amazon Elastic File System"
DESCRIPTION = "The AWS Java SDK for Amazon Elastic File System module \
holds the client classes that are used for communicating \
with Amazon Elastic File System."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-efs-1.11.3-12.2.noarch.rpm"
RPM_HASH = "45b62890660c97599ef0a413d7d414a960e4fb37a83c17eea59e9e40f29cfdd257289905cfc3d9f43e3d2fa51f00f076e54d0e495ef4580dce92101f3cf381b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-efs \
mvn-com.amazonaws-aws-java-sdk-efs \
mvn-com.amazonaws-aws-java-sdk-efs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
