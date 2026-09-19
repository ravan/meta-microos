SUMMARY = "Documentation for djvulibre"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.30"

RPM_NAME = "djvulibre-doc-3.5.30-1.3.noarch.rpm"
RPM_HASH = "1d28caebbf5d3660cfd6dbc91818f1ed685403ebdfd4c4cdb8c03edfbb528273a4d317b8f347e309b54d399d62d0d1000ebf0f765843aa989db5abc1f57cbbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "djvulibre-doc"

RDEPENDS:${PN} += ""

inherit rpm
