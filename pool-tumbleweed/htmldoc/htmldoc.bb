SUMMARY = "HTML Processor that Generates HTML, PostScript, and PDF Files"
DESCRIPTION = "HTMLDOC converts HTML source files into indexed HTML, PostScript, or \
Portable Document Format (PDF) files that can be viewed online or printed."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.24"

RPM_NAME = "htmldoc-1.9.24-1.1.aarch64.rpm"
RPM_HASH = "7cdaa4ee566296d403fb63ec8fddb6d242be164498460a72fe1a4bf288011d6c87e54c544eddb1a4098a60fa76bd98da09cff649a4d17fce337e629215eb0855"

RPROVIDES:${PN} += "htmldoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXpm.so.4 \
libc.so.6 \
libcups.so.2 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
