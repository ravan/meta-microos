SUMMARY = "Documentation for qt6-networkauth in HTML format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-networkauth-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "be425f9d0f8345d0703fd7d3f4f8c6e8ca426ed237389900d3ae937a6850988c7823581a3fa1e27d679e5d29a8b2320d42709a8a7da14289a982683a9ed68f98"

RPROVIDES:${PN} += "qt6-networkauth-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
