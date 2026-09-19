SUMMARY = "Development files for libxcrypt"
DESCRIPTION = "The libxcrypt-devel package contains libraries and header files for \
developing applications that use libxcrypt."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.5.2"

RPM_NAME = "libxcrypt-devel-4.5.2-2.4.aarch64.rpm"
RPM_HASH = "859a2143b625d3b291079def95774bd4f6d73c7ce5df62442e4a5a4597f62e83f83ae1645c6e469d8202e17e89f3614368a367aa7d198582ac027c9b9ae70b08"

RPROVIDES:${PN} += "glibc-devel-/usr/lib64/libcrypt.so \
libxcrypt-devel \
pkgconfig-libcrypt \
pkgconfig-libxcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrypt1 \
pkgconfig"

inherit rpm
