SUMMARY = "A Color Picker"
DESCRIPTION = "A color picker program designed for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "colorpicker-1.1.5-2.9.aarch64.rpm"
RPM_HASH = "9439bceda9cee8150cb3b391ea4a869945b4cd7c83cf28f385ed694d3550c78bc1137c28a998c5eb53da5a4b72874662586853db52ce0f63afa3c2a21c1bee2f"

RPROVIDES:${PN} += "colorpicker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
