SUMMARY = "SELinux configuration GUI"
DESCRIPTION = "system-config-selinux is a utility for managing the SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-gui-3.11-2.2.noarch.rpm"
RPM_HASH = "132c6bc63e63286c2f24b5cee5100daccce1fb2e2f5896daf087e92013e8daa7c84ef653991f798e452d6a6a6d6dda41efd6a55a948e5e2adfa3fbcf4a901bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-gui"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
policycoreutils-dbus \
policycoreutils-devel \
python-abi \
python3 \
python3-gobject-Gdk \
python3-policycoreutils \
selinux-policy \
setools-console \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk"

inherit rpm
