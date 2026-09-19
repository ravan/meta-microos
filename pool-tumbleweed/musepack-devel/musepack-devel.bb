SUMMARY = "Development Files for Musepack"
DESCRIPTION = "This package includes development files for musepack."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later & Zlib"

PV = "r475"

RPM_NAME = "musepack-devel-r475-6.10.aarch64.rpm"
RPM_HASH = "fa39a62ea9a5384208789451bf9ad73305e83ec3a3fe336f74c5d68b3ec383d0b4bd53ef519f7deb3317df8877256d83725c23cdcbc8bc353675b91516869d7f"

RPROVIDES:${PN} += "musepack-devel"

RDEPENDS:${PN} += "libmpcdec6"

inherit rpm
