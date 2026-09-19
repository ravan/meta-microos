SUMMARY = "Documentation for qt6-httpserver in HTML format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-httpserver-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9a00024fbefc2bab6317055a579d00e945c63b691a96c0060a644b75dfab8aa4f0229718ae1b28c3ce5fcbeeb84240c5627a0587108946d8c1ff0de50d20d534"

RPROVIDES:${PN} += "qt6-httpserver-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
