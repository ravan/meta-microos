SUMMARY = "Shared-storage based death"
DESCRIPTION = "A highly reliable fencing or Shoot-the-other-node-in-the-head (STONITH) \
mechanism that works by utilizing shared storage."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2+20260320.2c43532"

RPM_NAME = "sbd-1.5.2+20260320.2c43532-2.3.aarch64.rpm"
RPM_HASH = "4586fbc91b692beab8494c743d0b80f42a43522915822cc391ead3ccf43afae937afc74f964beffedb1957a05136a14b09205692fa50828304f9a7ca319747c2"

RPROVIDES:${PN} += "pkgconfig-sbd \
sbd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/pkg-config \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libaio.so.1 \
libc.so.6 \
libcib.so.54 \
libcmap.so.4 \
libcrmcluster.so.53 \
libcrmcommon.so.68 \
libglib-2.0.so.0 \
libpe-status.so.56 \
libqb.so.100 \
libuuid.so.1 \
libvotequorum.so.8 \
systemd"

inherit rpm
