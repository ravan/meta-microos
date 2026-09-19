SUMMARY = "Documentation for siproxd"
DESCRIPTION = "HTML and PDF documentation for siproxd"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "siproxd-doc-0.8.3-7.8.aarch64.rpm"
RPM_HASH = "2390e7157353b7500a4bdfde44b7859beee2ebdac9798d139e1153ed0e2b7e17e7f6b683a7324a28d61bbb3a9347de7e636f52abdf2c9c05dfeb3d733bdf2436"

RPROVIDES:${PN} += "siproxd-doc"

RDEPENDS:${PN} += ""

inherit rpm
