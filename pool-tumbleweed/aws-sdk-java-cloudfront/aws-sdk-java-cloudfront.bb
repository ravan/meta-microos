SUMMARY = "AWS Java SDK for Amazon CloudFront"
DESCRIPTION = "The AWS Java SDK for Amazon CloudFront module holds the \
client classes that are used for communicating with \
Amazon CloudFront Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudfront-1.11.3-12.2.noarch.rpm"
RPM_HASH = "40a4c6c837c9242f32af66c2b0a9fd23d4bdf39ea097bfbc70202529886de8f1c738991a203cb39478370c907e9cb521a3919f900d0123d30ef4a637a6eed378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudfront \
mvn-com.amazonaws-aws-java-sdk-cloudfront \
mvn-com.amazonaws-aws-java-sdk-cloudfront-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
