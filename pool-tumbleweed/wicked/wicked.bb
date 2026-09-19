SUMMARY = "Network configuration infrastructure"
DESCRIPTION = "Wicked is a network configuration infrastructure incorporating a number \
of existing frameworks into a unified architecture, providing a DBUS \
interface to network configuration."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.80"

RPM_NAME = "wicked-0.6.80-2.1.aarch64.rpm"
RPM_HASH = "ce646efdd92b1e8d13cd9f5a8f8ca49ffb3f3091c29d3c9387cea159616fae85b314f70687f8e6397e5bdc91450a523db27a85e6001bb89868a3fc1d3a8cec2d"

RPROVIDES:${PN} += "libwicked-0-6 \
libwicked-0.6.80.so \
wicked"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcrypt.so.20 \
libnl-3.so.200 \
libsystemd.so.0 \
sysconfig-netconfig \
systemd \
util-linux-systemd \
wicked-service"

inherit rpm
