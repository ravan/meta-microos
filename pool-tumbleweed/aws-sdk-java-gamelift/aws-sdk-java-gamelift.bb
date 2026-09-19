SUMMARY = "AWS Java SDK for AWS GameLift"
DESCRIPTION = "The AWS Java SDK for AWS GameLift module holds the \
client classes that are used for communicating with \
AWS GameLift service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-gamelift-1.11.3-12.2.noarch.rpm"
RPM_HASH = "f9cc0ae6486707ff1bddaea587ad8509d3d6bfd3f4eb5b21e0064e3f084a050fdba547ef9e55237bdb4dc37fab72b3760a8dce86712b2e0e9285f9a0c5198c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-gamelift \
mvn-com.amazonaws-aws-java-sdk-gamelift \
mvn-com.amazonaws-aws-java-sdk-gamelift-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
