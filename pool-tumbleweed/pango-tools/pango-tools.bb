SUMMARY = "Tools for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.58.2"

RPM_NAME = "pango-tools-1.58.2-1.1.aarch64.rpm"
RPM_HASH = "1304271663483a0f7ec6d48b00864528ef5a198d70ace84174f148abbf11b5c00415c808276783cc6f224b2a2f1238f15218c8096e86e31073a513b55b0c2aee"

RPROVIDES:${PN} += "pango-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangoxft-1.0.so.0"

inherit rpm
