SUMMARY = "Configuration that automatically enables all bluetooth devices"
DESCRIPTION = "Contains configuration that automatically enables all bluetooth devices \
that are connected to the system if no other tool is handling them (e.g. \
desktop specific applets like blueman or GNOME or KDE applets)."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-auto-enable-devices-5.82-2.4.noarch.rpm"
RPM_HASH = "30a0d8655f6964dceae870806bab8c15f61c9f4fb1d00401e1d2ce6ef7246f9c5070baad642b0a8164dd3d67904ab33cad92ce7254a1ff0c8671e1bc6d35bc7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-auto-enable-devices \
config-bluez-auto-enable-devices"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
