SUMMARY = "MicroOS Desktop default settings"
DESCRIPTION = "This package provides MicroOS defaults for GNOME settings."
LICENSE = "BSD-3-Clause"

PV = "20230420"

RPM_NAME = "gnome-branding-MicroOS-20230420-1.9.noarch.rpm"
RPM_HASH = "fbb0ca465ee5b27f1247a697f43327653aea10297542b1bf77244583b30357c24020d336833c218418d60cc5c743afd0e70795bdec0cf7bd7f9e4434704e0796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gnome-branding-MicroOS \
gnome-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
gio-branding-openSUSE \
sound-theme-freedesktop \
transactional-update \
zenity"

inherit rpm
