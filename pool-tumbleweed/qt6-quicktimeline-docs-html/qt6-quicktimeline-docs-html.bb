SUMMARY = "Documentation for qt6-quicktimeline in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quicktimeline-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9e81c3c7ae972d5dce119defd6beefb169c4e25513f03386dcdf3146bb30fa419e810edd4ec80e1b28e9a165b2b3dcb09e44356eab33870005856e066296ecae"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
