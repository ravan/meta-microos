SUMMARY = "Aeon default settings"
DESCRIPTION = "This package provides Aeon defaults for GNOME settings."
LICENSE = "BSD-3-Clause"

PV = "20231005"

RPM_NAME = "gnome-branding-Aeon-20231005-14.1.noarch.rpm"
RPM_HASH = "357c604e50fcc3f8991ad62ac7d1d0bff6db351f1a1f5719784b03f42c8688407c06a74b721f561473e2f64a4f2a6d8dda6169c204082292c517d28ac62ba55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-branding-Aeon \
gnome-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
flatpak \
gio-branding-openSUSE \
gnome-initial-setup \
polkit \
sound-theme-freedesktop \
sudo \
transactional-update \
zenity"

inherit rpm
