SUMMARY = "AWS Java SDK for Amazon CloudWatch"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch module holds the \
client classes that are used for communicating with \
Amazon CloudWatch Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudwatch-1.11.3-12.2.noarch.rpm"
RPM_HASH = "cee8a8af350cca19a744daa19d601c32845fe9ba3570f91fe5acbed0005ed129cc0d85cc5973e85c1ac454e16d957806f2357fe4d1da3626ff57dafc4aa01633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
