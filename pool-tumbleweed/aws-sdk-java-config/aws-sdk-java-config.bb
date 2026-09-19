SUMMARY = "AWS Java SDK for AWS Config"
DESCRIPTION = "The AWS Java SDK for AWS Config module holds the \
client classes that are used for communicating with \
AWS Config Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-config-1.11.3-12.2.noarch.rpm"
RPM_HASH = "9ab0a5e71ab982e837787aaf6fed1c4be9480dd37bdb5d8303d8eadb349cf21f20bb0fbe38b54fed3669da989dfcc662988ecb6f77b84f41f9bf2610e06bf7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-config \
mvn-com.amazonaws-aws-java-sdk-config \
mvn-com.amazonaws-aws-java-sdk-config-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
