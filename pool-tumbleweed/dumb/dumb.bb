SUMMARY = "Dynamic Universal Music Bibliotheque"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-2.0.3-1.19.aarch64.rpm"
RPM_HASH = "47ed1db7b4fdbc5985fa85d733ea89d40d62487a89ea43c814798c83a50347b6cb0100c45b8e1946329b56cc4ab1a504eaa76692aaac01ab404c7871be85922b"

RPROVIDES:${PN} += "dumb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libargtable2.so.0 \
libc.so.6 \
libdumb.so.2"

inherit rpm
