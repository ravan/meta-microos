SUMMARY = "AWS Java SDK for Amazon RDS"
DESCRIPTION = "The AWS Java SDK for Amazon RDS module holds the \
client classes that are used for communicating with \
Amazon Relational Database Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-rds-1.11.3-12.2.noarch.rpm"
RPM_HASH = "8bd9236010f74654ab2cb5989329a2278451141b51b71b501c24c6b42410dde0ed4f2d8390309ac237bf9fefb702e1f6c848791a34619b97b8b9fbd698f1e7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-rds \
mvn-com.amazonaws-aws-java-sdk-rds \
mvn-com.amazonaws-aws-java-sdk-rds-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
