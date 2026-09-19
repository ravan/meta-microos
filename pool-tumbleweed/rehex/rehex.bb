SUMMARY = "Reverse Engineers' Hex Editor"
DESCRIPTION = "A hex heditor with a number of features for analysing and annotating \
binary file formats. \
 \
Current features include: \
 \
    Large file support (tested up to 1 TiB) \
    Decoding of integer/floating point value types \
    Disassembly of machine code \
    Highlighting and annotation of ranges of bytes"
LICENSE = "GPL-2.0-only"

PV = "0.64.0"

RPM_NAME = "rehex-0.64.0-1.5.aarch64.rpm"
RPM_HASH = "d96fe2b987235e96e22ca3a2617b9164187757a146ae8c33fbc9624a885b9a402afeeda539ce51ddc57a17ad7bc367d6a73b1f044be80146567dab4b8c0bfc6a"

RPROVIDES:${PN} += "rehex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbotan-3.so.13 \
libc.so.6 \
libcapstone.so.5 \
libgcc-s.so.1 \
libgtk-x11-2.0.so.0 \
libjansson.so.4 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libunistring.so.5 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-aui-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0 \
libwx-gtk2u-propgrid-suse.so.16.0.0"

inherit rpm
