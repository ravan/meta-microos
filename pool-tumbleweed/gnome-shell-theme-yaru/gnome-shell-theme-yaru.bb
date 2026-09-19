SUMMARY = "Yaru GNOME shell themes"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the GNOME Shell themes."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "gnome-shell-theme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "93233c97c8381b0f72dfcbea4d923e3b976e4b826ca1921ae2162ba32319ba87dd1208d518c284968504c47a1eba3e82de9ed478786f75f5c801c3339e23e275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-theme-yaru"

RDEPENDS:${PN} += "gnome-shell \
metatheme-yaru-common"

inherit rpm
