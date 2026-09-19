SUMMARY = "AWS Java SDK for AWS CodeCommit"
DESCRIPTION = "The AWS Java SDK for AWS CodeCommit module \
holds the client classes that are used for \
communicating with AWS CodeCommit."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codecommit-1.11.3-12.2.noarch.rpm"
RPM_HASH = "daa73c45bbbe0540ce11d8c50c84c07f9dfaf172d48d3f72a6637b1f238629e22dd5d7901abd3bc5baf0ca53708321cdaefbef5129ace076e296668e004e28ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codecommit \
mvn-com.amazonaws-aws-java-sdk-codecommit \
mvn-com.amazonaws-aws-java-sdk-codecommit-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
