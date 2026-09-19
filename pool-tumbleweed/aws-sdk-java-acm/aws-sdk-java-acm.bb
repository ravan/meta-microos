SUMMARY = "AWS Java SDK for AWS Certificate Manager"
DESCRIPTION = "The AWS Java SDK for AWS Certificate Manager module \
holds the client classes that are used for communicating \
with AWS Certificate Manager service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-acm-1.11.3-12.2.noarch.rpm"
RPM_HASH = "92182125ee771b8c6a498e783baf553807ce2fd84e034c4e187e2489991a512e3a9f244e43800b0d290e261707ebe36a5d4b3db194096c7b25fe7667b37d59ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-acm \
mvn-com.amazonaws-aws-java-sdk-acm \
mvn-com.amazonaws-aws-java-sdk-acm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
