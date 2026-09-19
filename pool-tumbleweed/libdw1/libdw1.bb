SUMMARY = "Library to access DWARF debugging information"
DESCRIPTION = "This package provides a high-level library to access the DWARF debugging \
information. This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libdw1-0.194-1.4.aarch64.rpm"
RPM_HASH = "77449c57613ac97667dd82254a13ad8ee8103c397256fc1bf9dacdd486c8a38f70a905e134a106a547bbcc54aacff221fa33c4c6ccfdc483c46673c65584176d"

RPROVIDES:${PN} += "libdw.so.1 \
libdw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libelf.so.1 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
