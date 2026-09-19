SUMMARY = "Library package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "libdbus-1-3-1.14.10-5.5.aarch64.rpm"
RPM_HASH = "c68034ec929c9257b5c21622b143cb9d327f2b82f0803cd08c446b0f3d30e2f37caffd429effdcef9790b78ed5d686f8bc14747765e1128a7c8adf5a6ce44a28"

RPROVIDES:${PN} += "dbus-libs \
libdbus-1-3 \
libdbus-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
dbus-1-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
