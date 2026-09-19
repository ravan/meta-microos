SUMMARY = "AWS Java SDK for AWS CloudTrail"
DESCRIPTION = "The AWS Java SDK for AWS CloudTrail module holds the \
client classes that are used for communicating with \
AWS CloudTrail Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudtrail-1.11.3-12.2.noarch.rpm"
RPM_HASH = "5a16d81674fa85ddfbdf8b78213d71fa9418ca7b87ffabac814c7c62853c98e25f25bb5c547e90fb81b574a97b5e5d98ea59d95530567d2688641bd65140d078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudtrail-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
