SUMMARY = "Documentation for qt6-multimedia in HTML format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "11ababb752cf973453824e2fa90334116f30aa4457ef617725a1623f9a998736e0e02fe75d3bc0cf82e7de99117a28d26f707836635b8441f9a2ee1f81fc7b01"

RPROVIDES:${PN} += "qt6-multimedia-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
