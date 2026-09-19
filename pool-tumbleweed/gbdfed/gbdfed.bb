SUMMARY = "A Gtk-based BDF Font Editor, Descendant of XmBDFed"
DESCRIPTION = "A Gtk-based bitmap font (BDF) editor, descendant of XmBDFed. It can \
import PK/GF fonts, HBF fonts (Han Bitmap Font),Linux console fonts \
(PSF, CP, FNT), Sun console fonts (vfont), Windows FON/FNT fonts, \
TrueType fonts and collections, and X server fonts. It exports PSF and \
HEX fonts and allows you to edit two- and four-bits-per-pixel grayscale \
fonts."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "gbdfed-1.6-12.7.aarch64.rpm"
RPM_HASH = "79ae517ef02dc8a78a797c349d7b3cd41cec9639361ba449f23b69d63366efdcb8e0ec3b7f1e7ee0f489ef6d11128874af004d8b1388ff0cc4b5b48b509f43fe"

RPROVIDES:${PN} += "gbdfed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
