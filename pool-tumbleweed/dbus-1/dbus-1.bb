SUMMARY = "D-Bus Message Bus System"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "dbus-1-1.14.10-5.5.aarch64.rpm"
RPM_HASH = "393c4901ba21f688fe24e26cf5eb7d5dbfa20a92b1491449a0b62e557c6b120e474f9673432c3ec4d4f5926380fc899fc9e6a0c4988e93cd09c9ed7383c245b7"

RPROVIDES:${PN} += "dbus-1"

RDEPENDS:${PN} += "/usr/bin/cmp \
/usr/bin/sh \
dbus-1-common \
dbus-1-tools \
dbus-broker \
libdbus-1-3"

inherit rpm
