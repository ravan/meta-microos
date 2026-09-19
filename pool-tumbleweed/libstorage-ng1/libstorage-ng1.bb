SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.352"

RPM_NAME = "libstorage-ng1-4.5.352-1.1.aarch64.rpm"
RPM_HASH = "874696c1f5a2190b249abac8ec4f754968787b079a4e4455c8e2d627d71e010c93aabe7f4f68f0a35cd061baf5b323a0fa53b75e92d77b44077329c912e8a70e"

RPROVIDES:${PN} += "libstorage-ng.so.1 \
libstorage-ng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
coreutils \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
lsscsi \
parted \
pkgconfig \
pkgconfig-udev \
util-linux"

inherit rpm
