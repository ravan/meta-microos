SUMMARY = "The GNOME Desktop Menu -- openSUSE Menus Definitions"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec \
 \
This package provides the openSUSE definitions for menus."
LICENSE = "LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "gnome-menus-branding-openSUSE-42.1-2.9.noarch.rpm"
RPM_HASH = "506be5dd31f958c9e220e33be49c5bd80a045f580bd4d3194c7e495589c849d458de1ccf378237e313a458b14cdab4348154b1f507ec663a67c071f53960ced6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-menus-branding \
gnome-menus-branding-openSUSE"

RDEPENDS:${PN} += "gnome-menus"

inherit rpm
