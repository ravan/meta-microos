SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "00f882837a9a4cd542fc04a8fc953decb611d6e3c4af3633b09550f1676f96582d1f45bef31675a879ead0faff3b9cfa44a2f6af425d3d214ab7c1baebdc95da"

RPROVIDES:${PN} += "cross-i386-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
