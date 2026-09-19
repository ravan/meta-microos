SUMMARY = "Documentation for qt6-location in HTML format"
DESCRIPTION = "This package contains documentation for qt6-location in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-location-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fecae7bb47df6a02b8616c027d426ecc9fb3208ab0774635e3cb05b1fb98511da6ddae83dc1c2a98e69f4ac6443cd183d31d4ff7372eb28202cc82db87205721"

RPROVIDES:${PN} += "qt6-location-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
