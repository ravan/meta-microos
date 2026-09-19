SUMMARY = "AWS Java SDK for Amazon CloudWatch Logs"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch Logs module \
holds the client classes that are used for communicating \
with Amazon CloudWatch Logs Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-logs-1.11.3-12.2.noarch.rpm"
RPM_HASH = "df875e0c1ce71f6cbc94a0d44d21a7e9bf2b74d40c1f806ab0f9f5f3f9791b84755dd399e6a850405011cef7153c65a9689317d45170cb9a35dff1c0e97d14af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-logs \
mvn-com.amazonaws-aws-java-sdk-logs \
mvn-com.amazonaws-aws-java-sdk-logs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
