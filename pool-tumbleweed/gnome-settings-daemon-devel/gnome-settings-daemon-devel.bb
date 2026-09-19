SUMMARY = "Development package for the GNOME settings daemon"
DESCRIPTION = "gnome-settings-daemon provides a daemon run by all GNOME sessions to \
provide live access to configuration settings and the changes done to \
them as well as basic services like a clipboard manager, controlling \
the startup of the screensaver, etc. \
 \
This package includes header files used for client applications to \
contact the settings daemon via its DBus interface."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "50.1+6"

RPM_NAME = "gnome-settings-daemon-devel-50.1+6-1.2.aarch64.rpm"
RPM_HASH = "5a7eafc4090c33f7028823500491067d11de58bb4688167e4835ac5f2b0e0c71040ca0eeea817b87ee389f13301fe8ab862ece12fc00e10ac27438b967244e61"

RPROVIDES:${PN} += "gnome-settings-daemon-devel \
pkgconfig-gnome-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-settings-daemon"

inherit rpm
