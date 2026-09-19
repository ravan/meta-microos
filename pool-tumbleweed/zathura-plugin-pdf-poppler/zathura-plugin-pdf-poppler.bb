SUMMARY = "PDF support for zathura via poppler"
DESCRIPTION = "The zathura-pdf-poppler plugin adds PDF support to zathura by using the \
poppler rendering engine."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-plugin-pdf-poppler-2026.07.18-1.1.aarch64.rpm"
RPM_HASH = "48f8b9c27d12129559820f44d38dfea9bfadfe2bd1a884951ad2f621293e73d2b1a85fbec7f1626060231320a85e8f4b99bb4fc30f47571aefaf67f941dbf7be"

RPROVIDES:${PN} += "libpdf-poppler.so \
zathura-pdf-poppler-plugin \
zathura-plugin-pdf-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgirara.so.5 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpoppler-glib.so.8 \
zathura"

inherit rpm
