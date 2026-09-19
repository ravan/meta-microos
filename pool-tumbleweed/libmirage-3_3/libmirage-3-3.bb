SUMMARY = "CD-ROM image format plugins for libmirage"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package provides the image format plugins for libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "libmirage-3_3-3.3.2-2.1.aarch64.rpm"
RPM_HASH = "9c7516b78314d6a061b7ec61cdab9a16363bf7083bbbe2c13dff3bfeca21ca7d5655e47614270383efba16ec9e147b43f081ce3ee8aa6a3bed3723f26cdcc116"

RPROVIDES:${PN} += "libmirage-3-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libchdr.so.0 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libmirage.so.12 \
libsamplerate.so.0 \
libsndfile.so.1 \
libz.so.1"

inherit rpm
