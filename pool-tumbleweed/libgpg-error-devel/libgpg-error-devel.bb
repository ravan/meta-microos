SUMMARY = "Development package for libgpg-error"
DESCRIPTION = "Files needed for software development using libgpg-error."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.61"

RPM_NAME = "libgpg-error-devel-1.61-2.1.aarch64.rpm"
RPM_HASH = "66bf5c0a397a425b6261723996eb4cc27c553bd2f28571b7ff11ce12bc472902cd44bf95ffb8b4a3d3dd135fe87e50db196798f0f2b712b1d1093a4b955f4970"

RPROVIDES:${PN} += "libgpg-error-devel \
pkgconfig-gpg-error"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0 \
libgpg-error0"

inherit rpm
