SUMMARY = "XML Parser in C"
DESCRIPTION = "The current version of RXP supports XML 1.1, Namespaces 1.1, xml:id, \
and XML Catalogs. To use an XML Catalog, set the environment variable \
XML_CATALOG_FILES to a space-separated list of catalog files. \
 \
RXP was written by Richard Tobin at the Language Technology Group, \
Human Communication Research Centre, University of Edinburgh. \
 \
A simple application (called rxp) is provided. It parses and writes XML \
data, optionally expanding entities, defaulting attributes, and \
translating to a different output encoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "rxp-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "24fb2cb65556aca7d77069167745d7c09f19b28aceec40c7767d8559ecf09605469f2da1d620ed2cd809850dee47834675f5fe89e64797e97b42024300cde38f"

RPROVIDES:${PN} += "rxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librxp.so.0"

inherit rpm
