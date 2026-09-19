SUMMARY = "AWS Java SDK for Amazon Elastic Transcoder"
DESCRIPTION = "The AWS Java SDK for Amazon Elastic Transcoder module \
holds the client classes that are used for communicating \
with Amazon Elastic Transcoder Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elastictranscoder-1.11.3-12.2.noarch.rpm"
RPM_HASH = "a848639e4ff21de3a22744ea30f81ce692139ceb0d7f5ccc5c1d221e9e8626858b6815cdfeed57d224f0caf08b9ad524a02ce7b21ab5609b69f45e5177e0b90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
