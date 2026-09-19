SUMMARY = "AWS Java SDK for Amazon SWF"
DESCRIPTION = "The AWS Java SDK for Amazon SWF module holds the \
client classes that are used for communicating with \
Amazon Simple Workflow Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-simpleworkflow-1.11.3-12.2.noarch.rpm"
RPM_HASH = "ec87e367c6b0e68d7cdb5624904d2dec8d3ba81d3018b12c9a016bd252735a6319c68b99844341671f8b5c78d1c8aa328be3d9f9af046279926ccc5c7774db57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-simpleworkflow \
mvn-com.amazonaws-aws-java-sdk-simpleworkflow \
mvn-com.amazonaws-aws-java-sdk-simpleworkflow-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
