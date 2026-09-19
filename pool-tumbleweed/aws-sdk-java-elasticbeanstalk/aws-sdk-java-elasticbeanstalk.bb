SUMMARY = "AWS Java SDK for AWS Elastic Beanstalk"
DESCRIPTION = "The AWS Java SDK for AWS Elastic Beanstalk module holds the \
client classes that are used for communicating with \
AWS Elastic Beanstalk Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticbeanstalk-1.11.3-12.2.noarch.rpm"
RPM_HASH = "e66264689d5492bc85033450c72167c8850523c211b77c78deaa0b34aa07926f4c6d775dda0aebc96fc0d4d0673a24d5d719d06f7ac6462a8662b2f26a12bbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticbeanstalk \
mvn-com.amazonaws-aws-java-sdk-elasticbeanstalk \
mvn-com.amazonaws-aws-java-sdk-elasticbeanstalk-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
