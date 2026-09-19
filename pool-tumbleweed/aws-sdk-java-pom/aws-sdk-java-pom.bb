SUMMARY = "AWS SDK for Java - Parent POM"
DESCRIPTION = "AWS SDK for Java - Parent POM."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-pom-1.11.3-12.2.noarch.rpm"
RPM_HASH = "ccdcc9e41ff6eafe7e47949236444f06756bb0443296d40701ed41ac758ecd1ea7115e341b9e111280020fe8ebd41f6ed54ed471f1dd01529027d4414393bfc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-pom \
mvn-com.amazonaws-aws-java-sdk-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
