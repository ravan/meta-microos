SUMMARY = "A customizable document viewer"
DESCRIPTION = "zathura is a customizable document viewer. It provides a minimalistic \
and space-saving interface as well as a keyboard-centric interaction."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-2026.07.18-1.1.aarch64.rpm"
RPM_HASH = "eac9f98994d37631b347ce65a5c45235e162098489df331a4fbd57262430f2ce37081e1ba0b5b42e095e9e62ebc256a5085f5a70393d1b1c904c8ed65739f99d"

RPROVIDES:${PN} += "zathura"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libgirara.so.5 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmagic.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libseccomp.so.2 \
libsqlite3.so.0 \
libsynctex.so.2 \
libxxhash.so.0"

inherit rpm
