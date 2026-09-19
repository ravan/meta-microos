SUMMARY = "Development files for libimobiledevice"
DESCRIPTION = "The libimobiledevice-devel package contains libraries and header files for \
developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0+0git.20251010"

RPM_NAME = "libimobiledevice-devel-1.4.0+0git.20251010-1.6.aarch64.rpm"
RPM_HASH = "e7d9ff82805e1b476fd9ecc41072403ca8bb010ef5beca39ccb70f1d2cc97f5b118d6566148f3117ec215df49bc2c59e4495a726b64f86dacf8a1793367d9cec"

RPROVIDES:${PN} += "libimobiledevice-devel \
pkgconfig-libimobiledevice-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-1-0-6 \
pkgconfig-libimobiledevice-glue-1.0 \
pkgconfig-libplist-2.0 \
pkgconfig-libusbmuxd-2.0 \
pkgconfig-openssl"

inherit rpm
