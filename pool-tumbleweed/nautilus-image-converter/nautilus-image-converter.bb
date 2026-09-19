SUMMARY = "Nautilus Image Converter"
DESCRIPTION = "The Nautilus-Image-Converter extension allows you to resize/rotate images \
from Nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "nautilus-image-converter-0.4.0-4.3.aarch64.rpm"
RPM_HASH = "e8b3b8d79a10a1106d89cc6da97c39e72882801e3450cf59b9815d3a68898074c8976449ce3f0370c3cf3135927a39d5f0406dae2bdc429f8dddc880ad314831"

RPROVIDES:${PN} += "libnautilus-image-converter.so \
nautilus-image-converter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnautilus-extension.so.4"

inherit rpm
