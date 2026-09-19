SUMMARY = "ThinIce Theme for GTK+ 2"
DESCRIPTION = "This package provides the ThinIce GTK+ 2 theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-thinice-2.20.2-23.6.noarch.rpm"
RPM_HASH = "4deed8d9811985ac2ee1790c7b1fff1d08f84f6e938f080efa1a0cb932e86314d3818842d47b1df2c0fa06320a8057a84e23e3561e2e117764a8003d851960bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-thinice"

RDEPENDS:${PN} += "gtk2-engine-thinice"

inherit rpm
