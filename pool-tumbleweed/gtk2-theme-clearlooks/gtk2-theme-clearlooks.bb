SUMMARY = "Clearlooks Theme for GTK+ 2"
DESCRIPTION = "This package provides the Clearlooks GTK+ 2 theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-clearlooks-2.20.2-23.6.noarch.rpm"
RPM_HASH = "cd664407158b6722a5e47e9f8f6461014d85e7273a0fd8e9f9fea1082136cc8223668e47929afc4ee63b7265dfb36ef1632c58c24fe58128d8928c728451746e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-clearlooks"

RDEPENDS:${PN} += "gtk2-engine-clearlooks"

inherit rpm
