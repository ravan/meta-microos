SUMMARY = "AWS Java SDK for AWS Directory Service"
DESCRIPTION = "The AWS Java SDK for AWS Directory Service module \
holds the client classes that is used for \
communicating with AWS Directory Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-directory-1.11.3-12.2.noarch.rpm"
RPM_HASH = "3306d166c8541ee1dc581a58a51bee88e07a042278724b6e135ac91d82dbeae9021f6bff391dc011a838effdd78582bd75c3fb246da1d16e249b0b8d8e332518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-directory \
mvn-com.amazonaws-aws-java-sdk-directory \
mvn-com.amazonaws-aws-java-sdk-directory-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
