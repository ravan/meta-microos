SUMMARY = "AWS Java SDK for Amazon Cognito Identity Provider Service"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Identity Provider Service module \
holds the client classes that are used for communicating with \
Amazon Cognito Identity Provider Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitoidp-1.11.3-12.2.noarch.rpm"
RPM_HASH = "ae7c96af27fb95ffff678b6aec195fb0228d6f41e52c014fb66e90a6b54c5e9d1b7cf0853c629e57ea2d04735b1287963763eba1a0e31ef2a6edbf80ef7c118d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitoidp \
mvn-com.amazonaws-aws-java-sdk-cognitoidp \
mvn-com.amazonaws-aws-java-sdk-cognitoidp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
