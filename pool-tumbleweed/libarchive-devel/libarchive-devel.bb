SUMMARY = "Development files for libarchive"
DESCRIPTION = "Libarchive is a programming library that can create and read several \
different streaming archive formats, including most popular tar \
variants and several cpio formats. It can also write shar archives and \
read ISO-9660 CDROM images. The bsdtar program is an implementation of \
tar(1) that is built on top of libarchive. It started as a test \
harness, but has grown and is now the standard system tar for FreeBSD 5 \
and 6. \
 \
This package contains the development files."
LICENSE = "BSD-2-Clause"

PV = "3.8.9"

RPM_NAME = "libarchive-devel-3.8.9-1.1.aarch64.rpm"
RPM_HASH = "be06eceeeb63b79322ed58c2fe23470beea402a6d21e3445fd4021f98254d487c2fce001ff39571bc478c8eacac82a08a37bb743a2b554c1033269cabaa6759d"

RPROVIDES:${PN} += "libarchive-devel \
pkgconfig-libarchive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarchive13"

inherit rpm
