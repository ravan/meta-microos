SUMMARY = "D-Bus message bus daemon"
DESCRIPTION = "D-Bus is a message bus system, This package contains the original \
dbus-daemon to make it easier to switch to dbus-broker"
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "dbus-1-daemon-1.14.10-5.5.aarch64.rpm"
RPM_HASH = "c32b1b59106ddff15ef8eec223dc38bd9866f589411fc7e6668bdb0a2495aee0d035096c5bce3d214d3225c678c22bf9e1235b29baf067fa684a489392342f24"

RPROVIDES:${PN} += "dbus-1-/usr/bin/dbus-daemon \
dbus-1-daemon \
dbus-launch"

RDEPENDS:${PN} += "/usr/bin/sh \
group-messagebus \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libdbus-1.so.3 \
libexpat.so.1 \
libselinux.so.1 \
libsystemd.so.0 \
permissions"

inherit rpm
