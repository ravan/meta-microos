SUMMARY = "Documentation for Qtractor"
DESCRIPTION = "This package contains qtractor-manual-and-howtos.pdf \
For your reading"
LICENSE = "GPL-2.0-or-later"

PV = "1.5.12"

RPM_NAME = "qtractor-doc-pdf-1.5.12-1.3.noarch.rpm"
RPM_HASH = "900a7fa7a9f953ec6d17ad30f639732470007e795712e92d8256a79579512ca6935e82ec7eca2aa47f7e1e2d5741f970a4bf022947bb9670474ca880fdc6f75e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtractor-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
