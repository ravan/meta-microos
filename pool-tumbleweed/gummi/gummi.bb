SUMMARY = "Simple LaTeX editor"
DESCRIPTION = "Gummi is a LaTeX editor written using the GTK+ toolkit. It was designed with \
simplicity in mind, but is useful for both novice and advanced LaTeX writers."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-0.8.3-3.6.aarch64.rpm"
RPM_HASH = "4e82ebd8c4dfc1d1e090d33c9335415785957d0efd3e5e528b51f7f69d3a10501da7ac7bd4ba1b60eca479df081b328fc610997bdda0eb37712b251654d7966c"

RPROVIDES:${PN} += "gummi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libgtkspell3-3.so.0 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libsynctex.so.2 \
texlive-latex \
texlive-synctex"

inherit rpm
