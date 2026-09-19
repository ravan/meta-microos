SUMMARY = "AWS Java SDK for Amazon Kinesis"
DESCRIPTION = "The AWS Java SDK for Amazon Kinesis module holds the \
client classes that are used for communicating with \
Amazon Kinesis Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-kinesis-1.11.3-12.2.noarch.rpm"
RPM_HASH = "7543599b7935c80fe061f7904dfb8100a0852658418e29a84ff148b6a819085cbf5c482d118591df38866b3eb275d974228228a2b8104b5c1cacd6298d8e8797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-kinesis \
mvn-com.amazonaws-aws-java-sdk-kinesis \
mvn-com.amazonaws-aws-java-sdk-kinesis-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
