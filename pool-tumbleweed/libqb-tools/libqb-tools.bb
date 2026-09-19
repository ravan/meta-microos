SUMMARY = "Utilities from libqb, an IPC library"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.9+20250916.4b496d0"

RPM_NAME = "libqb-tools-2.0.9+20250916.4b496d0-1.5.aarch64.rpm"
RPM_HASH = "251dc12545abae04ff4b4c6cd935961c67078fc78b401c482347ce1957353f3e26360a703ea142b8833dd6110f32c9d4f98e6f425f5c1b469ad64747fed4fd83"

RPROVIDES:${PN} += "libqb-tools \
libqb0-/usr/sbin/qb-blackbox"

RDEPENDS:${PN} += "libc.so.6 \
libqb.so.100"

inherit rpm
