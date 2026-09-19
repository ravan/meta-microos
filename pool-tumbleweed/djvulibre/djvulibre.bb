SUMMARY = "An Implementation of DjVu"
DESCRIPTION = "DjVu is a Web-centric format and software platform for distributing \
documents and images. DjVuLibre is an implementation of DjVu, \
including viewers, browser plug-ins, decoders, encoders, and \
utilities. DjVu can replace PDF, PS, TIFF, JPEG, and GIF for \
distributing scanned documents, digital documents, or high-resolution \
pictures. DjVu content is often smaller and consumes less client \
resources than competing formats."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.30"

RPM_NAME = "djvulibre-3.5.30-1.3.aarch64.rpm"
RPM_HASH = "b1f698d6a7d3b5e2eedf0618440859ce03abdada425cc2367dbb9ef8b8183724d0f6cf47a8824ab94dfa561683a75cf9340c7c5fc6ef445bd6536d6563f74d6a"

RPROVIDES:${PN} += "djvulibre"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
