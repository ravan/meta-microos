SUMMARY = "Upstream menus definition for the MATE desktop menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
https://freedesktop.org/Standards/menu-spec \
 \
This package provides the upstream definitions for menus."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-menus-branding-upstream-1.28.0-2.5.noarch.rpm"
RPM_HASH = "b9655ac0c81fa96af3817c902dfdafb3cd290221ff960b8162b217d8a068eaf42303a9be671b5fef04c6ae2b5c479dd3c24206b1f2a112f20aed41dad7159a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-menus-branding-upstream \
mate-menus-branding \
mate-menus-branding-upstream"

RDEPENDS:${PN} += "mate-menus"

inherit rpm
