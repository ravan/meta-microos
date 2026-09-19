SUMMARY = "AWS Java SDK for Amazon SimpleDB"
DESCRIPTION = "The AWS Java SDK for Amazon SimpleDB module holds the \
client classes that are used for communicating with \
Amazon SimpleDB Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-simpledb-1.11.3-12.2.noarch.rpm"
RPM_HASH = "c4dc5a0d199fe2c431b35587b055831ea160c24403c174cff092a590749eba2cbc5734104b5c660211c5f9defa1ae441c168b5adc9dc5fe3527fb4048514b958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-simpledb \
mvn-com.amazonaws-aws-java-sdk-simpledb \
mvn-com.amazonaws-aws-java-sdk-simpledb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
