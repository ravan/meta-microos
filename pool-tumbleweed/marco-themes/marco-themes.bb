SUMMARY = "MATE window manager themes"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "marco-themes-1.28.1-2.5.noarch.rpm"
RPM_HASH = "29a81d9eaffabe3b285eb382092e73833fe898d166f4c27d45598c0fdb1b1e306201bca7536b1e17570e9c3d515d235ab0d2d20c8f7dee07465b8a884dbebf32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marco-themes \
mate-window-manager-themes"

RDEPENDS:${PN} += ""

inherit rpm
