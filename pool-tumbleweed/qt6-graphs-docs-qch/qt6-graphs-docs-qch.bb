SUMMARY = "Documentation for qt6-graphs in QCH format"
DESCRIPTION = "This package contains documentation for qt6-graphs in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-graphs-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f5365f7eac861a3d342ce41c03381600fe2826b24bf483ae9e53fb5cdaf935e1b5e8131d2c5cbb88e876678fabff331743eb83cbeddbfe0b0ab6c7f6c86daa0a"

RPROVIDES:${PN} += "qt6-graphs-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
