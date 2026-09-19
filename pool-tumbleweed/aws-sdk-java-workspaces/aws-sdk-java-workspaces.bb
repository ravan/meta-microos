SUMMARY = "AWS Java SDK for Amazon WorkSpaces"
DESCRIPTION = "The AWS Java SDK for Amazon WorkSpaces module holds the \
client classes that are used for communicating with \
Amazon WorkSpaces Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-workspaces-1.11.3-12.2.noarch.rpm"
RPM_HASH = "ca4e921695fb42ca08690ab6563815465836dd6e4f9e9958861c36e826b79f9b5ef874a8526ae7f070b8324f00ba7d50afae006e6a11b584101925436384c65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-workspaces \
mvn-com.amazonaws-aws-java-sdk-workspaces \
mvn-com.amazonaws-aws-java-sdk-workspaces-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
