SUMMARY = "API documentation for jaxb-api"
DESCRIPTION = "API documentation for jaxb-api."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "jaxb-api-javadoc-4.0.0-3.9.noarch.rpm"
RPM_HASH = "9ed196633daebed334bdb789562eab167540c4458ef58695fddf1d1aff5f2c68ecea2974854805079291b65673978f7f85fb329c8fb38c712aa31539f6ab5923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxb-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
