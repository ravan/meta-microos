SUMMARY = "Documentation for qt6-canvaspainter in HTML format"
DESCRIPTION = "This package contains documentation for qt6-canvaspainter in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-canvaspainter-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "22e5731e3359ed5e533b19dc67bc420334fecd085f75ccae9ef958caa7c0ed2c2c566d0db24699d018b7afbe33da9f6ab9a0b8608a4f980b70bbe9c99cd6d6fa"

RPROVIDES:${PN} += "qt6-canvaspainter-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
