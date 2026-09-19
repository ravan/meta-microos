SUMMARY = "Documentation for qt6-httpserver in QCH format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-httpserver-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5a11c47825c6b5272bf12aba0c76556c383adf96a31b3acc50d64f16db5cce53708342cf5e47c40f7486d0e187ffc5656facecbe5aa601136fd8c78a58352393"

RPROVIDES:${PN} += "qt6-httpserver-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
