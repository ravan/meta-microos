SUMMARY = "Tool for filesystem snapshot management"
DESCRIPTION = "This package contains snapper, a tool for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "snapper-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "721e326785c4f77881ed7ebf0de439b398782326ce0903084f8148209f3dac6a2e43aef6ec8ecce25b62533a6ea31ddc5f960102aa3aa023999c6210b090c5b9"

RPROVIDES:${PN} += "snapper"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-service \
diffutils \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libmount.so.1 \
libsnapper.so.8 \
libsnapper8 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.16 \
systemd"

inherit rpm
