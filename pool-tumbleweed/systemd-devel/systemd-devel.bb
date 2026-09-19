SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-devel-261.2-1.2.aarch64.rpm"
RPM_HASH = "57760dab8a9c696ea33125e133f6023c75e959be71b55f5d3dd35c90891aef50341c804b221b5b7935ee44b5b932580e9c072cdcad320432403113ef55fb77c2"

RPROVIDES:${PN} += "libudev-devel \
pkgconfig-libsystemd \
pkgconfig-libudev \
systemd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0 \
libudev1 \
systemd-rpm-macros"

inherit rpm
