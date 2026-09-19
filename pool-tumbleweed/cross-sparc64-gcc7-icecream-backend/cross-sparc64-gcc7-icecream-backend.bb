SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "addbaf22c268f0d45dd09f3dda0e75aae329ada972f2bd1c742b4bd91fc8ac5f6a5cb2c83293fc9c3aa242d785d9983afe46a718513011bfc9ab05bc000ef443"

RPROVIDES:${PN} += "cross-sparc64-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
