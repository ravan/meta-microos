SUMMARY = "A typesetting system for music notation"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-2.24.4-1.19.aarch64.rpm"
RPM_HASH = "e816c094692932f2c5ae82f6e986ead606738189f40d3b847f55a17137a895519b6281a71a4f76e3126793c3fec56a3431b378af9e158965e694115611150fcf"

RPROVIDES:${PN} += "lilypond"

RDEPENDS:${PN} += "/usr/bin/python3 \
ghostscript \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgc.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libguile-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libstdc++.so.6 \
lilypond-fonts-common"

inherit rpm
