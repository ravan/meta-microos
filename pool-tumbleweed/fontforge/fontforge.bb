SUMMARY = "A Font Editor"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts.  With it, you can \
create new fonts or modify old ones.  It also converts font formats and \
can convert among PostScript (ASCII & binary Type 1, some Type 3s, and \
some Type 0s), TrueType, OpenType (Type2), and CID-keyed fonts."
LICENSE = "GPL-3.0-or-later"

PV = "20251009"

RPM_NAME = "fontforge-20251009-7.3.aarch64.rpm"
RPM_HASH = "9f2bc537880092efc8afb14d2ff9cef203a58c7309d9ca162dc65f59336f51187c3bd4c615cce0b78b057fa8b37ce123bc6fc458452b15735047194e240cb79d"

RPROVIDES:${PN} += "fontforge \
libfontforge.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgif.so.7 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libharfbuzz.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libpython3.13.so.1.0 \
libreadline.so.8 \
libsigc-2.0.so.0 \
libspiro.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libwoff2dec.so.1.0.2 \
libwoff2enc.so.1.0.2 \
libxml2.so.16 \
libz.so.1 \
python-abi"

inherit rpm
