SUMMARY = "SELinux policy core DBUS api"
DESCRIPTION = "The policycoreutils-dbus package contains the management DBUS API use to manage \
an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-dbus-3.11-2.2.noarch.rpm"
RPM_HASH = "87269f0a7d1ca9d1fa7102f9ab2ad81f8e391e992892c963f9aab21f4c243d84ccaf9b5730c61c731c11cd7257da17a4c9dcee379ca6ec5c7dbafd55c51e36d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-dbus"

RDEPENDS:${PN} += "/usr/bin/python3 \
polkit \
python3-gobject \
python3-policycoreutils \
typelib-GLib \
typelib-GObject"

inherit rpm
