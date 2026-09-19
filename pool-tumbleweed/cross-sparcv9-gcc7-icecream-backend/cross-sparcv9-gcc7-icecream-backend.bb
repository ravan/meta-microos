SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparcv9-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "80434b28b6708a3d6aefda60627957925e663d4e44643e4b4c51308c58a0a0976f4ae945fe959e3891ee6ce21f0ac5c35272625de0e81191ae8809e19266cab5"

RPROVIDES:${PN} += "cross-sparcv9-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
