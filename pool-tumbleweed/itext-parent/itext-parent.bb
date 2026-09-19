SUMMARY = "iText Parent POM"
DESCRIPTION = "The Parent POM for iText Projects."
LICENSE = "AGPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "itext-parent-1.0.0-1.17.noarch.rpm"
RPM_HASH = "78d351e180cb1fcd63298222930fda83389e84dac163652e3c32c03e3191bc577a8dc619ea43443c4f86a7cc03ff73f0f01ecd25b64c5bad43a354a5af0c3568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itext-parent \
mvn-com.itextpdf-itext-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
