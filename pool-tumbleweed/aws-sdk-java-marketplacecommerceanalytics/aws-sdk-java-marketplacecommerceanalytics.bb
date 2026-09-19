SUMMARY = "AWS Java SDK for AWS Marketplace Commerce Analytics"
DESCRIPTION = "The AWS Java SDK for AWS Marketplace Commerce Analytics Service module \
holds the client classes that are used for communicating with \
AWS Marketplace Commerce Analytics Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-marketplacecommerceanalytics-1.11.3-12.2.noarch.rpm"
RPM_HASH = "adff8699f3ff4622ee16b6fbbac7268f49354a421497d792f95140813e10a63ab6a335b88d1ed9d855ee2006e995da3745405d8d5c8754477b5e0cff58019af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-marketplacecommerceanalytics \
mvn-com.amazonaws-aws-java-sdk-marketplacecommerceanalytics \
mvn-com.amazonaws-aws-java-sdk-marketplacecommerceanalytics-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
