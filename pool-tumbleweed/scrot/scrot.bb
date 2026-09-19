SUMMARY = "Screenshot Capture Utility"
DESCRIPTION = "A nice and straightforward screen capture utility implementing \
the dynamic loaders of imlib2."
LICENSE = "SUSE-Scrot"

PV = "1.12.1"

RPM_NAME = "scrot-1.12.1-2.4.aarch64.rpm"
RPM_HASH = "a64df5be1d638929e1af15917d677265d55b47d6260278de4bf50fc4351343a623c60ceec2fa578a5392f0e4dd44aa9e9b2ee6e2d7770a3422deb4c9716e26b2"

RPROVIDES:${PN} += "scrot"

RDEPENDS:${PN} += "imlib2 \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libc.so.6"

inherit rpm
