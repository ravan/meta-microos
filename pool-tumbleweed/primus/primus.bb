SUMMARY = "Faster OpenGL offloading for Bumblebee"
DESCRIPTION = "Primus is a shared library that provides OpenGL and GLX APIs and \
implements low-overhead local-only client-side OpenGL offloading via GLX \
forking, similar to VirtualGL. It intercepts GLX calls and redirects GL \
rendering to a secondary X display, presumably driven by a faster GPU. \
On swapping buffers, rendered contents are read back using a PBO and \
copied onto the drawable it was supposed to be rendered on in the first \
place."
LICENSE = "HPND"

PV = "0+git20150328.d1afbf6"

RPM_NAME = "primus-0+git20150328.d1afbf6-4.9.aarch64.rpm"
RPM_HASH = "a0a82f0b6443eb3281ca03d1cd6da4b3f17a74e3f0347ab1e24af56aaecec7757eb7f458e8930285a43718098fb2937c1deffc406e1955c9bb381fbddb8ca7bd"

RPROVIDES:${PN} += "libGL.so.1 \
primus"

RDEPENDS:${PN} += "/usr/bin/bash \
bumblebee \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
