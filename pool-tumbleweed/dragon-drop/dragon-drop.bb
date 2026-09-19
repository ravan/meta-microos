SUMMARY = "Simple drag-and-drop source/sink for X or Wayland"
DESCRIPTION = "dragon is a lightweight drag-and-drop source/target for X or Wayland."
LICENSE = "GPL-3.0"

PV = "1.2.0"

RPM_NAME = "dragon-drop-1.2.0-1.9.aarch64.rpm"
RPM_HASH = "b53782861967ff2e9355b782f818acd6ad1cece66770ee87155df1800ba768a7c4fe83f26f0013f9d0f0c6df127c921f462214d92b538a5389759b1565a316b3"

RPROVIDES:${PN} += "dragon-drop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
