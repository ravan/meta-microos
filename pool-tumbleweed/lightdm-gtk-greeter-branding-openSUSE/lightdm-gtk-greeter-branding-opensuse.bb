SUMMARY = "openSUSE branding of lightdm-gtk-greeter"
DESCRIPTION = "This package provides the openSUSE look and feel for lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "lightdm-gtk-greeter-branding-openSUSE-2.0-7.1.noarch.rpm"
RPM_HASH = "6bfea8746badc74cf5f68c5737d7259184179c642e4483115bb0edf0f0d8ef8642f408567807152b79eaea67fa2d805d782ee62702e29efb5ddd863e8d4c1594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lightdm-gtk-greeter-branding-openSUSE \
lightdm-gtk-greeter-branding \
lightdm-gtk-greeter-branding-openSUSE"

RDEPENDS:${PN} += "gtk3-metatheme-greybird-geeko \
lightdm-gtk-greeter \
numlockx-default \
wallpaper-branding"

inherit rpm
