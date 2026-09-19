SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-menus-3.38.1-1.6.aarch64.rpm"
RPM_HASH = "0c8812d4443b23db7a9f4ead7da7773d03adff0c3fe6c768388be0c2a1e6f54d455bf1ae1716ca8c077e32bcbb101069630a12caff3474da0f1b4d7821d6031a"

RPROVIDES:${PN} += "gnome-menus"

RDEPENDS:${PN} += "gnome-menus-branding"

inherit rpm
