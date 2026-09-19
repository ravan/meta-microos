SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime0-1.2.4+git20180804.fff99cd-9.7.aarch64.rpm"
RPM_HASH = "b07c4f6f658cbe65b9403e0ab4960fe88a395c9aacfdd6670e921ed7d6e0d712b7e704738369fc812c00380b8478fa525792cd00a318e7760ce98a45c08182d0"

RPROVIDES:${PN} += "libquicktime.so.0 \
libquicktime0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
