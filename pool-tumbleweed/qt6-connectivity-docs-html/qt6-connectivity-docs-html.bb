SUMMARY = "Documentation for qt6-connectivity in HTML format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-connectivity-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "52650a1fdc10f15c76cc146748bdbb79dd5f4807b94e1afdc9fe68aefed752a5502c4f700908e6dd055b2002c06b4bf9458d31789f7a8f58fba629f12a656420"

RPROVIDES:${PN} += "qt6-connectivity-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
