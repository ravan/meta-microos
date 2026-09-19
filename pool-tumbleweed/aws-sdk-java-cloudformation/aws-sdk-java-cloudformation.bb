SUMMARY = "AWS Java SDK for AWS CloudFormation"
DESCRIPTION = "The AWS Java SDK for AWS CloudFormation module holds the \
client classes that are used for communicating with \
AWS CloudFormation Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudformation-1.11.3-12.2.noarch.rpm"
RPM_HASH = "110f7cfa14c86b2ee3cbb17bdf444119d47035d3cb33288ec99f629863918c2423b842ca767b7b9e77e37fcff8548b84e61e362f3ad76690524fdf7dcda1aa76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudformation \
mvn-com.amazonaws-aws-java-sdk-cloudformation \
mvn-com.amazonaws-aws-java-sdk-cloudformation-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
