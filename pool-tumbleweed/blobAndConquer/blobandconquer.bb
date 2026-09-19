SUMMARY = "Blob Wars: Blob and Conquer - a 3rd person action game"
DESCRIPTION = "With the apparent defeat of Galdov and the reclaiming of the Fire, \
Time, Space and Reality Crystals the Blobs' battle was only just \
beginning. Bob had rescued many Blobs and fought many battles, \
but now he had an ever bigger task ahead of him. The Blobs' \
homeworld is still littered with the alien forces and Bob once \
again makes it his task to lead the counter attack. But even \
without Galdov the aliens are still extremely well organised... \
 \
They're Ready. Will You Be?"
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "blobAndConquer-1.11-4.1.aarch64.rpm"
RPM_HASH = "42ee81a889bc9eb9a26574deb9c03b0e4593a48c218ba4c53721b8dff9b6efeb0f4616ef88fa8c2798c21185e27a16b11c6213349e9ef22fc95153786bffdf03"

RPROVIDES:${PN} += "blobAndConquer"

RDEPENDS:${PN} += "libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
