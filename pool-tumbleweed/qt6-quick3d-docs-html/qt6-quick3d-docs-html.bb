SUMMARY = "Documentation for qt6-quick3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "dac92b86168d656edbf9a361386005cc25944071d1c6880a323e745a8383924f8a40e9b2b4cf6f4bcd6aedaeeb2826642e6c69293e202278f717e0b12d0a90c5"

RPROVIDES:${PN} += "qt6-quick3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
