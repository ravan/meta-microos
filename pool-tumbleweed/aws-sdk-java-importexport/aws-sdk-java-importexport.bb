SUMMARY = "AWS Java SDK for AWS Import/Export"
DESCRIPTION = "The AWS Java SDK for AWS Import/Export module \
holds the client classes that are used \
for communicating with AWS Import/Export Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-importexport-1.11.3-12.2.noarch.rpm"
RPM_HASH = "9945e56174b41080885642b88b42675c691178c9d697613a79dd522f402c0555532cd3eb1c4d32719159679cf6c8096a57f3bde6a7a1d3aef5338acf1e8a773b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-importexport \
mvn-com.amazonaws-aws-java-sdk-importexport \
mvn-com.amazonaws-aws-java-sdk-importexport-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
