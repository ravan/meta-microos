SUMMARY = "Selective Colour Photo Filter"
DESCRIPTION = "tintii takes full colour photos and processes them into black and white \
with some select regions highlighted in colour. The technique is known \
as colour popping or selective colouring."
LICENSE = "GPL-2.0"

PV = "2.10.0"

RPM_NAME = "tintii-2.10.0-4.46.aarch64.rpm"
RPM_HASH = "43ad00e54d6e539b22d7d9f0669f5977bb18ecd815b47c8486e39635d9beb0597b6fb5591bc425c3c413f6bf8a8cecdb0c5b66b5cfb970fd321c318c5d04afd6"

RPROVIDES:${PN} += "tintii"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-aui-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0"

inherit rpm
