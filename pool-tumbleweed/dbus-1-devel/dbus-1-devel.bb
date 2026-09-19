SUMMARY = "Developer package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "dbus-1-devel-1.14.10-5.5.aarch64.rpm"
RPM_HASH = "ae92f5a538872439f75aa212ecf9ce27762de8089735f14ae683dc2b27f46ee69cf93bb901bbad9b3202213a4aa25a528353c61eff956640b6f936a78753deb6"

RPROVIDES:${PN} += "cmake-DBus1 \
dbus-1-devel \
pkgconfig-dbus-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
glibc-devel \
libdbus-1-3"

inherit rpm
