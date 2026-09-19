SUMMARY = "API documentation for apache-commons-imaging"
DESCRIPTION = "This package contains the API documentation for apache-commons-imaging."
LICENSE = "Apache-2.0"

PV = "1.0.0~alpha6"

RPM_NAME = "apache-commons-imaging-javadoc-1.0.0~alpha6-1.3.noarch.rpm"
RPM_HASH = "a700cb955e838996a77af2b50b67c1ac3cc46dbd57a0f16771444f7b5f87e20ac9a33ce092d11f4dd8a6d71836de379eec10cf9ef89c721b6c507a98932172ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-imaging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
