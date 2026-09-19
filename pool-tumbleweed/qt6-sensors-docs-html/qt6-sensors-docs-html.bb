SUMMARY = "Documentation for qt6-sensors in HTML format"
DESCRIPTION = "This package contains documentation for qt6-sensors in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "43a1edfa4ce1c2c4668e6d8112485cd63162a63e15b780d9887087bce56a2c21ebf6f256a0f096731255487ce270d04363b116d1e1a3430622970c4f2c2adf59"

RPROVIDES:${PN} += "qt6-sensors-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
