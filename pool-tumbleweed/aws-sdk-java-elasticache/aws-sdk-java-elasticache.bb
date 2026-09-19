SUMMARY = "AWS Java SDK for Amazon ElastiCache"
DESCRIPTION = "The AWS Java SDK for Amazon ElastiCache module holds the \
client classes that are used for communicating with \
Amazon ElastiCache Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticache-1.11.3-12.2.noarch.rpm"
RPM_HASH = "768d229e470ec513c74c9ccc0eb421c9d5fdb8d9012b39e20699357bf2f19fccdb3548c03e86e10ee9057742a22596a91f39304944a3aca55f200b6f503a03af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticache \
mvn-com.amazonaws-aws-java-sdk-elasticache \
mvn-com.amazonaws-aws-java-sdk-elasticache-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
