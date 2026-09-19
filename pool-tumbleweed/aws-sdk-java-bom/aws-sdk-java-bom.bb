SUMMARY = "AWS SDK for Java - BOM"
DESCRIPTION = "The AWS SDK for Java - BOM module holds the \
dependency managements for individual Java clients."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-bom-1.11.3-12.2.noarch.rpm"
RPM_HASH = "186062ce8aa7cc0f4e8e6509185bdf973b25f4d48c3c1ec70375a0f786427160aba02fdf799ae2ea0dceba59d250b671e77c20d4bf071ab0f2cd099453f661b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-bom \
mvn-com.amazonaws-aws-java-sdk-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-pom-pom-"

inherit rpm
