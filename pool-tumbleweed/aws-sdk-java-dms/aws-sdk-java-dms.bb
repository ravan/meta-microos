SUMMARY = "AWS Java SDK for AWS Database Migration Service"
DESCRIPTION = "The AWS Java SDK for AWS Database Migration Service module \
holds the client classes that are used for communicating \
with AWS Database Migration Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-dms-1.11.3-12.2.noarch.rpm"
RPM_HASH = "8decb00bba68568c9786e083b63a091673575966254d4f31bd69614a4f724d77601d1fd710616817a0d118a2af1ea7912156e370014a93a9ee790cfa3c2c1f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-dms \
mvn-com.amazonaws-aws-java-sdk-dms \
mvn-com.amazonaws-aws-java-sdk-dms-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
