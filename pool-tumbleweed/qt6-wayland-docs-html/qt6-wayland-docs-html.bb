SUMMARY = "Documentation for qt6-wayland in HTML format"
DESCRIPTION = "This package contains documentation for qt6-wayland in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d4f6a2ae14861d6a4daab8afad04671fddc2bcf0375c9ef55f8bdbe2c3663cc5f23eb7e1d232721ba10f8286b0890ba4b74805468cef0c7429749275263e2929"

RPROVIDES:${PN} += "qt6-wayland-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
