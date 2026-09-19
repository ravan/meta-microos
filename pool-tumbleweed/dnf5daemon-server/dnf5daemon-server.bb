SUMMARY = "Package management service with a DBus interface"
DESCRIPTION = "Package management service with a DBus interface."
LICENSE = "GPL-2.0-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5daemon-server-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "098b6e0d4eb0b1815c277884e91855a00590fdaa8cab0af490960e22c35b6b0476ace08ab3d3cb11e86c64d1c28a6f132c1927d6544f44d039345a6dba47fedb"

RPROVIDES:${PN} += "config-dnf5daemon-server \
dnf5daemon-server"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1-common \
dnf-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5-cli3 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsdbus-c++.so.2 \
libstdc++.so.6 \
polkit"

inherit rpm
