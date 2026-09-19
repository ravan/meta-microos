SUMMARY = "A Hex Editor for Reverse Engineers, Programmers"
DESCRIPTION = "A hex editor with a custom C++-like pattern language for parsing and highlighting a file's content, \
data import and export, string search, file hashing, disassembler support, bookmarks, data analyzers, \
demanglers, color picker, regex replacer, calculator, built-in cheat sheets and eye friendly UI."
LICENSE = "GPL-2.0-only"

PV = "1.38.1"

RPM_NAME = "ImHex-1.38.1-1.8.aarch64.rpm"
RPM_HASH = "383dbaba9a836a6f29ca9d1ab72413240cc0a2118eef007d022c0872c28074beeba567a1b651e5fed1280e816e98f03b8c5e04cb34819db2a774dbb979c0e49f"

RPROVIDES:${PN} += "ImHex \
bundled-capstone \
bundled-gnulib \
bundled-imgui \
bundled-intervaltree \
bundled-libpl \
bundled-libromfs \
bundled-microtar"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libfmt.so.10 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libglfw.so.3 \
libimhex.so.1.38.1 \
libm.so.6 \
libmbedx509.so.9 \
libssh2.so.1 \
libstdc++.so.6 \
libyara.so.10 \
libz.so.1 \
libzstd.so.1"

inherit rpm
