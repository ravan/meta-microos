SUMMARY = "Namespace aware SAX parser utility library"
DESCRIPTION = "Pentaho LibXML is a namespace aware SAX parser utility library. It \
facilitates implementing non-trivial SAX input handlers."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "pentaho-libxml-1.1.6-2.8.noarch.rpm"
RPM_HASH = "228dfccb06ddec38f158e8d9e3674d90d7f95e27ad09b57d3326634d6f98d8b2dce424819db930b91a34b9a95d67743161b59b61ebd9604ebb7f8781690f8c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase \
libloader"

inherit rpm
