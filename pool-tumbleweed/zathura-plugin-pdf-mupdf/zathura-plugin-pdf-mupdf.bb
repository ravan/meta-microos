SUMMARY = "Zathura PDF support through MuPDF"
DESCRIPTION = "Zathura-plugin-MupDF extends the document viewing support of Zathura to \
PDF, EPUB and OpenXPS with the help of MuPDF rendering engine."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-plugin-pdf-mupdf-2026.07.18-1.5.aarch64.rpm"
RPM_HASH = "c4b56d4e7d75e82b65f425a248ee775b345d1e0744c14724ccac4af21c3bd5562950956ed852bcad4dd4ad1640d00614b6e19d74b9152cd56772cf0bf1cf9978"

RPROVIDES:${PN} += "libpdf-mupdf.so \
zathura-pdf-mupdf-plugin \
zathura-plugin-pdf-mupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgirara.so.5 \
libglib-2.0.so.0 \
libmupdf.so.28.3 \
zathura"

inherit rpm
