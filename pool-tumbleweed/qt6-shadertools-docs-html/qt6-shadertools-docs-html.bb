SUMMARY = "Documentation for qt6-shadertools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-shadertools-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b27881caba5df990272570f9e2def987f4bc8b6d32dac9519858fb84282ec4c0f568aa60e542e0d2f871353d2d94db2695810b36f4c5c417f439ec47c8d3052c"

RPROVIDES:${PN} += "qt6-shadertools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
