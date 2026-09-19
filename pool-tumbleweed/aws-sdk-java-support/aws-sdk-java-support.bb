SUMMARY = "AWS Java SDK for AWS Support"
DESCRIPTION = "The AWS Java SDK for AWS Support module holds the \
client classes that are used for communicating with \
AWS Support Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-support-1.11.3-12.2.noarch.rpm"
RPM_HASH = "6aec582bce0d4c02aec1e32cde5f08841ee5c5bceb37621d0aaec1c558961b0a9fb23dc0243688d39faaace59091eb8ed139a6121aaa4e3d4e98742877410104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-support \
mvn-com.amazonaws-aws-java-sdk-support \
mvn-com.amazonaws-aws-java-sdk-support-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
