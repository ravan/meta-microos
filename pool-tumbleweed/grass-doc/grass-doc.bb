SUMMARY = "Documentation for GRASS GIS"
DESCRIPTION = "This package contains the HTML documentation files for GRASS GIS"
LICENSE = "GPL-2.0-or-later"

PV = "8.5.0"

RPM_NAME = "grass-doc-8.5.0-1.1.aarch64.rpm"
RPM_HASH = "357acb68b54454c464af1af5e018a1edaaabda4229160aad0e4aa2aea1f13015c1103ed009c819af869302ee9a86cc9a6685e86e8d67ecf79228b06180808add"

RPROVIDES:${PN} += "grass-doc"

RDEPENDS:${PN} += ""

inherit rpm
