SUMMARY = "Header files for libei, a library for emulated input under Wayland"
DESCRIPTION = "libei is a library for Emulated Input, targeting the Wayland stack."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libei-devel-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "a42483c8b8c3a4dc47b40d8c03abde2dda307c21e4b440bc209dcddfa88fb48e7e5f15d0730826de66eb314115849d57b0862fb9ac11c41f1e072dc86d5aca70"

RPROVIDES:${PN} += "libei-devel \
pkgconfig-libei-1.0 \
pkgconfig-libeis-1.0 \
pkgconfig-liboeffis-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libei.so.1 \
libei1 \
libevdev.so.2 \
libxkbcommon.so.0 \
pkgconfig-libsystemd"

inherit rpm
