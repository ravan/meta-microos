SUMMARY = "Documentation for qt6-graphs in HTML format"
DESCRIPTION = "This package contains documentation for qt6-graphs in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-graphs-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d2a6bdf904c5b156ea95ff76d2acb3881bf07a4b5f208359313c4ebed846dbc7567f81c7571cc0fd88e929cbc2d3b8e2be70ff6ff5317952a4228bf733a3b86b"

RPROVIDES:${PN} += "qt6-graphs-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
