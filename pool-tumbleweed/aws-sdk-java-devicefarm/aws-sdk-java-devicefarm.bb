SUMMARY = "AWS Java SDK for AWS Device Farm"
DESCRIPTION = "The AWS Java SDK for AWS Device Farm module \
holds the client classes that are used for \
communicating with AWS Device Farm."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-devicefarm-1.11.3-12.2.noarch.rpm"
RPM_HASH = "7027b221dff3ade735a033937bac33e2ff01a5f3789a480aff8fc943a6dab8b8094fd828e12db4304c051c8a9dcdac13dd6e452f655ce19f5525b2d7643d1154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-devicefarm \
mvn-com.amazonaws-aws-java-sdk-devicefarm \
mvn-com.amazonaws-aws-java-sdk-devicefarm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
