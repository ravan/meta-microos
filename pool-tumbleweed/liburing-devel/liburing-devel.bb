SUMMARY = "Development files for Linux-native io_uring I/O access library"
DESCRIPTION = "This package provides header files to include and libraries to link with \
for the Linux-native io_uring."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.15"

RPM_NAME = "liburing-devel-2.15-1.1.aarch64.rpm"
RPM_HASH = "058ad1329d879579db029da21cb8eb1ad2086ebf9960b346e587ed3c9fabedd9eaa081eea0124f881aecaaa8a4473a2f69fdfa000f8d805288383455c55fbb9a"

RPROVIDES:${PN} += "liburing-devel \
liburing2-devel \
pkgconfig-liburing \
pkgconfig-liburing-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liburing2 \
pkgconfig"

inherit rpm
