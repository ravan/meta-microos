SUMMARY = "AWS Java SDK for AWS IoT"
DESCRIPTION = "The AWS Java SDK for AWS Iot Service module holds the \
client classes that are used for communicating with \
AWS IoT Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-iot-1.11.3-12.2.noarch.rpm"
RPM_HASH = "c84bee0e6a6cb8d7c605dcd063aab53a21c5ee7d92064b7f4c20bcf11f43827d90d75d3f15f1f8314d806c2ec050bcc9135f3c2a47edd65017ba254525f7a51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-iot \
mvn-com.amazonaws-aws-java-sdk-iot \
mvn-com.amazonaws-aws-java-sdk-iot-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
