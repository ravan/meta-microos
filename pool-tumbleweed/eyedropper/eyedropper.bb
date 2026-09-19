SUMMARY = "Pick and format colors"
DESCRIPTION = "An application to pick and format colors. \
 \
Features: \
- Pick a Color \
- Enter a color in Hex-Format \
- Parse RGB/RGBA/ARGB Hex-Colors \
- View colors in formats \
- Customize which formats appear as well as their order \
- Generate a palette of different shades"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "eyedropper-2.2.1-1.5.aarch64.rpm"
RPM_HASH = "19a6029101a713c54c84d03cb3580295d2af86f62e35d242d308864073a969e428182db688a58d28839a5ac226b6b2bf84ef9ae5d86d631d7e1fe4a4e93457f5"

RPROVIDES:${PN} += "eyedropper"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6"

inherit rpm
