SUMMARY = "Development files for Mir exposing private internals"
DESCRIPTION = "This package provides extra development files to create compositors built on \
Mir that need acces to private internal interfaces"
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "2.28.0"

RPM_NAME = "mir-private-devel-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "c72a931556c209a399d392537be086e100b259a34a46b5aa8a983cd5ad83a5e2524d7f4b70e3e92f756a61fe797f8932acf4a74766a406612d61471b722dbe9e"

RPROVIDES:${PN} += "mir-private-devel \
pkgconfig-mirserver-internal \
pkgconfig-mirtest-internal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mir-devel \
pkgconfig-mircommon \
pkgconfig-mircore \
pkgconfig-mirplatform \
pkgconfig-mirserver \
pkgconfig-mirserver-internal \
pkgconfig-mirtest"

inherit rpm
