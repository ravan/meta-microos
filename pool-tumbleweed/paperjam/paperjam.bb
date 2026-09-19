SUMMARY = "A tool for transforming PDF documents"
DESCRIPTION = "PaperJam is a tool for processing PDF documents: re-ordering pages, \
scaling and rotating them, placing multiple pages on one sheet of paper, \
adding cropmarks, and many other tricks."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "paperjam-1.2.2-1.7.aarch64.rpm"
RPM_HASH = "8b2b2631008e5feb53a5b80fda4755ebbf57cbcb63af3f41b664f50c559a0e40cb9f637ae9bf576b92714008435b8d7433212b7a9b0772133456b7fc99deed95"

RPROVIDES:${PN} += "paperjam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpaper.so.2 \
libqpdf.so.30 \
libstdc++.so.6"

inherit rpm
