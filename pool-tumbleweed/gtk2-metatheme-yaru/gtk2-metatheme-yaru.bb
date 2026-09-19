SUMMARY = "GTK+ 2 support for the Yaru Gtk Theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package provides the GTK+ 2 support for Yaru theme."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "gtk2-metatheme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "f8c9275304423df1a7d656a9fe2aa97edc2239b72e54e51cfb5e0f502fdf5adfcc1432fd4db1db51b1ebd4bdf5fab6c792dbda0fccd9c347b8e7a3cdf5d1b45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-yaru"

RDEPENDS:${PN} += "gtk2-engine-murrine \
gtk2-theming-engine-adwaita \
metatheme-yaru-common"

inherit rpm
