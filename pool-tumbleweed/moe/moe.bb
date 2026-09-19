SUMMARY = "A Text Editor"
DESCRIPTION = "GNU Moe is an 8-bit clean, console text editor for ISO-8859 and ASCII \
character encodings. It has a modeless interface, online help, \
multiple windows, unlimited undo/redo capability, unlimited line length, global \
search/replace (on all buffers at once), block operations, automatic \
indentation, word wrapping, file name completion, directory browser, duplicate \
removal from prompt histories, delimiter matching, text conversion from/to \
UTF-8 and romanization."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "moe-1.16-1.3.aarch64.rpm"
RPM_HASH = "911a9d14e3e5d53aff10cd66d443419da8ac92f4a048b21b41fe97fbdcb3d16d8c2b8a6c76bbef3e12eccd312b9b02e6d69ccbab608f91ab51cbbb17c4d1973b"

RPROVIDES:${PN} += "config-moe \
moe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
