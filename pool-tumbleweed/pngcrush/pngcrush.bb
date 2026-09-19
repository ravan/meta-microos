SUMMARY = "Optimizer for PNG Files that can also insert or delete specified Chunks"
DESCRIPTION = "pngcrush is an excellent batch-mode compression utility for PNG \
images. Depending on the application that created the original PNGs, it can \
improve the file size anywhere from a few percent to 40% or more (completely \
losslessly). The utility also allows specified PNG chunks (e.g. text comments) \
to be inserted or deleted, and it can fix incorrect gamma info written by \
Photoshop 5.0 as well as the erroneous iCCP chunk written by Photoshop 5.5."
LICENSE = "Zlib"

PV = "1.8.13"

RPM_NAME = "pngcrush-1.8.13-2.11.aarch64.rpm"
RPM_HASH = "cf008f6315a5609e086909a83d5f62fa770bddb45e1706da340893f96d5f81da9c4dd93521e80e430b3118d6fc309a1179161f2000d29c98edaf8e1bdecd41ca"

RPROVIDES:${PN} += "pngcrush"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
