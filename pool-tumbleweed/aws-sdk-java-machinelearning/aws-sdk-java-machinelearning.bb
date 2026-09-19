SUMMARY = "AWS Java SDK for Amazon Machine Learning"
DESCRIPTION = "The AWS Java SDK for Amazon Machine Learning module \
holds the client classes that is used for communicating \
with Amazon Machine Learning Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-machinelearning-1.11.3-12.2.noarch.rpm"
RPM_HASH = "94947519e2cd55f2007312b56edaca94f60b927193f8d2ce9f52dfa1c4bb8af453b2400d36fe28e5f918b056e86f900125fb3c11bd6cc1510689f9f05b2d2a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-machinelearning \
mvn-com.amazonaws-aws-java-sdk-machinelearning \
mvn-com.amazonaws-aws-java-sdk-machinelearning-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
