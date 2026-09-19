SUMMARY = "Development files for libdvbv5"
DESCRIPTION = "The libdvbv5-devel package contains libraries and header files for \
developing applications that use libdvbv5."
LICENSE = "GPL-2.0-only"

PV = "1.32.0"

RPM_NAME = "libdvbv5-devel-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "fe07a52803cdceb42d92c72593ccc5775de4877e481b0d76d9f7db57aed3a5e1ec07f8f6046c7c3ee5dcbdd1d5e3a0957652ea25cd3c8b4a22761ebeb0cce9e0"

RPROVIDES:${PN} += "libdvbv5-devel \
pkgconfig-libdvbv5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvbv5-0 \
pkgconfig-libudev"

inherit rpm
