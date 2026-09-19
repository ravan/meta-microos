SUMMARY = "SELinux troubleshoot server"
DESCRIPTION = "Provides tools to help diagnose SELinux problems. When AVC messages \
are generated an alert can be generated that will give information \
about the problem and help track its resolution. Alerts can be configured \
to user preference. The same tools can be run on existing log files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.37"

RPM_NAME = "setroubleshoot-server-3.3.37-1.1.aarch64.rpm"
RPM_HASH = "533177ef228da1382849b2935606ef8de4bdf429baab5f5a15b0908404c9dabbd4d47a0effea35a5c35d1c68429475a035501d56912390d90cdc911cb00f15fb"

RPROVIDES:${PN} += "config-setroubleshoot-server \
group-setroubleshoot \
python3.13dist-setroubleshoot \
python3dist-setroubleshoot \
setroubleshoot-server \
user-setroubleshoot"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
audit \
audit-libs-python3 \
dbus-1 \
ld-linux-aarch64.so.1 \
libauparse.so.0 \
libc.so.6 \
libcap-ng.so.0 \
libdbus-1.so.3 \
libselinux.so.1 \
policycoreutils-python-utils \
polkit \
python-abi \
python3-dasbus \
python3-dbus-python \
python3-gobject \
python3-rpm \
python3-selinux \
python3-systemd \
setroubleshoot-plugins \
typelib-GLib \
typelib-GObject \
typelib-Gtk"

inherit rpm
