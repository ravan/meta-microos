SUMMARY = "C git library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.9.7"

RPM_NAME = "libgit2-devel-1.9.7-1.1.aarch64.rpm"
RPM_HASH = "9ce2a5b8c98f0861dac01a2add82501774f63ed700d371f8b8ba22fb106b910be22227f831c6c6b1df7a98cb158c1213f25d15342b2ea6c180b5e83869e0aa6d"

RPROVIDES:${PN} += "cmake-libgit2 \
libgit2-devel \
pkgconfig-libgit2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-1-9 \
pkgconfig-libpcre2-8 \
pkgconfig-libssh2 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
