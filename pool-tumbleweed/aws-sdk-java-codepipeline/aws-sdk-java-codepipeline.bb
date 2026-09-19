SUMMARY = "AWS Java SDK for AWS CodePipeline"
DESCRIPTION = "The AWS Java SDK for AWS CodePipeline module \
holds the client classes that are used for \
communicating with AWS CodePipeline."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codepipeline-1.11.3-12.2.noarch.rpm"
RPM_HASH = "b3f4d1bfaa0b456d593201a48ff97e4b462bbf6486b9ca800f82f37776b6e32a576d6b536391383e356c28c39f0cda277db93e061f4fb3c50740666ed9d676e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codepipeline \
mvn-com.amazonaws-aws-java-sdk-codepipeline \
mvn-com.amazonaws-aws-java-sdk-codepipeline-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
