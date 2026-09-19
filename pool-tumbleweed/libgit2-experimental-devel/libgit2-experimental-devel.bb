SUMMARY = "C git library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.9.7"

RPM_NAME = "libgit2-experimental-devel-1.9.7-1.1.aarch64.rpm"
RPM_HASH = "ccf1f79f15a79d86824ee46bd76072b576dac6f743f4f75aa767de6b5b2365cfa7890871e268e78d55a6eb64833a42e4ee60f9c55458cc715f93de6a21b775a5"

RPROVIDES:${PN} += "cmake-libgit2 \
libgit2-experimental-devel \
pkgconfig-libgit2-experimental"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-experimental1-9 \
pkgconfig-libpcre2-8 \
pkgconfig-libssh2 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
