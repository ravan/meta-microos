SUMMARY = "A Christmas Animation"
DESCRIPTION = "Xsnow is an application that animates snowfall, Santa and some scenery on your desktop. \
It is NOT a kind of screen saver: snow is falling, Santa rides his sleigh with reindeer \
while you are using your system. \
Xsnow runs on most varieties of Linux, and probably on other Unix systems as well. \
 \
Xsnow is derived from Rick Jansen's xsnow-1.42."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "xsnow-3.9.4-1.1.aarch64.rpm"
RPM_HASH = "96282768dc193ecbc7ea486b145bd587e2daf37247e906bb7b4f251fb94b38bbcd19ec9b42ea8a9fa8a876d4e8ede9ff6a99a0214088fcc47b0a9fb060f1bc0e"

RPROVIDES:${PN} += "xsnow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsl.so.28 \
libgslcblas.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6"

inherit rpm
