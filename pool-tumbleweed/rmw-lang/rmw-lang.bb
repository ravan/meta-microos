SUMMARY = "Translations for package rmw"
DESCRIPTION = "Provides translations for the 'rmw' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "rmw-lang-0.10.0-1.1.noarch.rpm"
RPM_HASH = "58ae6d8ee713b97b76d1d7a3c18937a6da8e340065802c4ead2b662636d8a7d2f355eaa3822bff76f33d8c3eafef2d8ce57bbbdabdefb5a4fb95b8c2b808e91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rmw-de \
locale-rmw-es-MX \
locale-rmw-fr \
locale-rmw-hi \
locale-rmw-nl \
locale-rmw-pl \
locale-rmw-pt-BR \
locale-rmw-ru \
locale-rmw-uk \
rmw-lang \
rmw-lang-all"

RDEPENDS:${PN} += "rmw"

inherit rpm
