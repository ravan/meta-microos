SUMMARY = "openSUSE Branding for awesome"
DESCRIPTION = "This package provides the openSUSE specific additions both for \
functions and look and feel for awesome window manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "awesome-branding-openSUSE-4.0-2.15.noarch.rpm"
RPM_HASH = "ae919b25f693e6c54d36a32fbf95b31cdea9fcdaed53aa741d7384fc218384c099b09893ea0b42888d22130cf0df43ce079a3ef6a18ec9692eca72c488df3955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-branding \
awesome-branding-openSUSE \
config-awesome-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-icon-theme \
awesome \
awesome-freedesktop \
awesome-vicious \
light-locker \
lua-lgi \
typelib-Gtk \
wallpaper-branding-openSUSE"

inherit rpm
