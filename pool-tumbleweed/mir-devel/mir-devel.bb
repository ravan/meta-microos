SUMMARY = "Development files for Mir"
DESCRIPTION = "This package provides the development files to create compositors built on Mir"
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "2.28.0"

RPM_NAME = "mir-devel-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "e09088d75f669799e454033312ba0919b495fd9c4bf8c2bcea763c291945a268811d401cac4ca697283e97d338fc232aba50a14b1a5cd5b63a53f210e6d14e80"

RPROVIDES:${PN} += "mir-devel \
pkgconfig-miral \
pkgconfig-mircommon \
pkgconfig-mircore \
pkgconfig-miroil \
pkgconfig-mirplatform \
pkgconfig-mirserver \
pkgconfig-mirtest \
pkgconfig-mirwayland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libmircommon12 \
libmirevdev10 \
libmiroil9 \
libmirserver67 \
libmirserverplatform23 \
libstdc++.so.6 \
libxml++-2.6.so.2 \
mir-test-libs-static \
pkgconfig-miral \
pkgconfig-mircommon \
pkgconfig-mircore \
pkgconfig-mirplatform \
pkgconfig-mirserver \
pkgconfig-uuid \
pkgconfig-wayland-server \
pkgconfig-xkbcommon"

inherit rpm
