SUMMARY = "Library for Rendering PostScript Documents"
DESCRIPTION = "libspectre is a small library for rendering Postscript documents. It \
provides a convenient easy to use API for handling and rendering \
Postscript documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "libspectre1-0.2.12-2.17.aarch64.rpm"
RPM_HASH = "4fe1d0d9518e997da745aa194b3872e73b49e16a1a1f1efbc9177e5359ff31c69f6a2b7dd13f779bc9595008ddf69182322ec97d8014a039495391e64f520df4"

RPROVIDES:${PN} += "libspectre.so.1 \
libspectre1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgs.so.10"

inherit rpm
