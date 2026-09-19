SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "f465b55bfc20fb04860c7e79c1e41b76b2d190a3dbaadd4f918396ef00ecc19d04cba26ef93360e14adb8ed92b0aaeb54acd82802cde5a6d4eaa631124e34306"

RPROVIDES:${PN} += "cross-hppa-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
