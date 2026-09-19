SUMMARY = "Documentation for qt6-webview in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webview in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-webview-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6dd7c7e7714eaab9840ae54bf2d571447cdf3c7e0e0996644f140b8a2032fb664ab061e2151a6cfb800623354632fec847720bd3f80f4ae655e64cd5875fa559"

RPROVIDES:${PN} += "qt6-webview-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
