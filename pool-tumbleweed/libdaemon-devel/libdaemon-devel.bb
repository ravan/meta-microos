SUMMARY = "Lightweight C library That Eases the Writing of UNIX Daemons"
DESCRIPTION = "libdaemon is a lightweight C library that eases the writing of UNIX \
daemons."
LICENSE = "GPL-2.0-or-later"

PV = "0.14"

RPM_NAME = "libdaemon-devel-0.14-19.17.aarch64.rpm"
RPM_HASH = "b08b7dceca0ae293a3032001637fd9848bf43a07d287e671c15a313044973d2377d7884178379889da9f7625a7885a7fcb6e1e4addf802b5c7caf212bb21d791"

RPROVIDES:${PN} += "libdaemon-devel \
pkgconfig-libdaemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdaemon0"

inherit rpm
