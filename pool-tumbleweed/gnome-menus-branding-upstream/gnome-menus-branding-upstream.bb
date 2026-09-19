SUMMARY = "The GNOME Desktop Menu -- Upstream Menus Definitions"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec \
 \
This package provides the upstream definitions for menus."
LICENSE = "LGPL-2.1-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-menus-branding-upstream-3.38.1-1.6.noarch.rpm"
RPM_HASH = "7ecaf8d6206afc3b7773f303ebc1beefbf2296180f2aee6df89d6d4e02b7f17172398d77683a013958edc63d7b98a9422ecf940527f62a428547da521fefc588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-menus-branding \
gnome-menus-branding-upstream"

RDEPENDS:${PN} += "gnome-menus"

inherit rpm
