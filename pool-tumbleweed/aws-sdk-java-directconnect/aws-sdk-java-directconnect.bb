SUMMARY = "AWS Java SDK for AWS Direct Connect"
DESCRIPTION = "The AWS Java SDK for AWS Direct Connect module holds the \
client classes that are used for communicating with \
AWS Direct Connect Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-directconnect-1.11.3-12.2.noarch.rpm"
RPM_HASH = "8fa0c7780a7d94ea30de0e594ea6d1a305405e99d4f000520194632743837466d31ae657679f1e05b1b1baa19b22a28c5dd74d5ad3fe46d3b86c7979932ed911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-directconnect \
mvn-com.amazonaws-aws-java-sdk-directconnect \
mvn-com.amazonaws-aws-java-sdk-directconnect-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
