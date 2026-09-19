SUMMARY = "AWS Java SDK for Amazon CloudWatch Events"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch Events module \
holds the client classes that are used for communicating \
with Amazon CloudWatch Events Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-events-1.11.3-12.2.noarch.rpm"
RPM_HASH = "52af30c3458d6eac79ce9baf26f021647e547290779e05ef36ecef9ae215b868b66dacaf3a943711b600163ed41396ec812c7ee9951ef0cda4303c24653bf749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-events \
mvn-com.amazonaws-aws-java-sdk-events \
mvn-com.amazonaws-aws-java-sdk-events-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
