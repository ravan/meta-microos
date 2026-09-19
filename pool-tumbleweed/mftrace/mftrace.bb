SUMMARY = "Scalable PostScript Fonts for MetaFont"
DESCRIPTION = "Mftrace is a small Python program that lets you trace a TeX bitmap font \
into a PFA or PFB font (A PostScript Type1 Scalable Font) or TTF \
(TrueType) font."
LICENSE = "GPL-2.0-only"

PV = "1.2.20"

RPM_NAME = "mftrace-1.2.20-4.5.aarch64.rpm"
RPM_HASH = "97ccacb4d8cadfc87be39f201bd7cd5ac27e79587c717ce6665203d560efe285981a809b67f5dcc0089d6dee7658fef773b7eab36c3d41af20c03694747bc98b"

RPROVIDES:${PN} += "mftrace"

RDEPENDS:${PN} += "bitmap-tracing \
fontforge \
ld-linux-aarch64.so.1 \
libc.so.6 \
t1utils \
texlive"

inherit rpm
