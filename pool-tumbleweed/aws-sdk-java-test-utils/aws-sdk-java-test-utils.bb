SUMMARY = "AWS SDK for Java - Test Utils"
DESCRIPTION = "The AWS SDK for Java - Test Utils module holds the \
all the utilities that are used by the tests."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-test-utils-1.11.3-12.2.noarch.rpm"
RPM_HASH = "6e173ab381ef2045f6ff1f7cbd1e87b58860cbae394bea7a519a65f5599bb307c8c2ea60ad2e558608251917a99c35ef80ea46c45059e6d1bf23771412740a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-test-utils \
mvn-com.amazonaws-aws-java-sdk-test-utils \
mvn-com.amazonaws-aws-java-sdk-test-utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-junit-junit"

inherit rpm
