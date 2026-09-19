SUMMARY = "Simple PDF comparison tool"
DESCRIPTION = "diff-pdf is a simple tool for comparing two PDF files."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "0.5.3"

RPM_NAME = "diff-pdf-0.5.3-1.1.aarch64.rpm"
RPM_HASH = "497fbd5f2f7e85260bc0b7e0b0b9a1b4fd73447e2376ef5847079c05e3a377f95bce943bc164f0943297e94a4e4e47f8c4315ac681c4e491f1bf85ff8b54882a"

RPROVIDES:${PN} += "diff-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpoppler-glib.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
