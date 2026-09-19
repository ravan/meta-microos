SUMMARY = "Source Code Editor based on Scintilla"
DESCRIPTION = "SciTE is a SCIntilla based Text Editor. Originally built to demonstrate \
Scintilla, it has grown to be a generally useful editor with facilities for \
building and running programs."
LICENSE = "MIT"

PV = "5.6.3"

RPM_NAME = "scite-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "b34ed462bffcb8e014881f6f09ea3795ea13faab332afdd68cbf64c0fefa64899dfe56ebb081e357460cd1a392c45f4eef13509628bfb54965496c5bbb896ede"

RPROVIDES:${PN} += "liblexilla.so \
scite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libscintilla.so.5 \
libstdc++.so.6"

inherit rpm
