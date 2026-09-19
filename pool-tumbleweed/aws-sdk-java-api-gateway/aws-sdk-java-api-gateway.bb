SUMMARY = "AWS Java SDK for Amazon API Gateway"
DESCRIPTION = "The AWS Java SDK for Amazon API Gateway module \
holds the client classes that are used for \
communicating with Amazon API Gateway."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-api-gateway-1.11.3-12.2.noarch.rpm"
RPM_HASH = "51d4b368bca2b13d4dcba144ea9c8e0937745f4a312554583c215abf545817c766c8f840ded40c88657ecfcf82da779e45d754929f20369945e02c5f24a34ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-api-gateway \
mvn-com.amazonaws-aws-java-sdk-api-gateway \
mvn-com.amazonaws-aws-java-sdk-api-gateway-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
