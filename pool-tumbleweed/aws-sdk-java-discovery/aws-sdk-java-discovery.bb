SUMMARY = "AWS Java SDK for AWS Application Discovery Service"
DESCRIPTION = "The AWS Java SDK for AWS Application Discovery Service module \
holds the client classes that are used for communicating with \
AWS Application Discovery Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-discovery-1.11.3-12.2.noarch.rpm"
RPM_HASH = "bf6f8ea2230ebc3a549a9e537cf21f116e999637a43f241469837256274efa1fe37eb10213fdcfac7a5001cb93b5e4207ed67cef08c3de70842323902a481698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-discovery \
mvn-com.amazonaws-aws-java-sdk-discovery \
mvn-com.amazonaws-aws-java-sdk-discovery-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
