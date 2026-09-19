SUMMARY = "A CD-ROM image access library"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "libmirage12-3.3.2-2.1.aarch64.rpm"
RPM_HASH = "204d227813b16ec8ffa155517af3cdf48231aeec9db876e149f1038008f6ea6ad869da3cfca6898dbc8f5f924258d54d5e39eed2549f01e52af58de0416cd882"

RPROVIDES:${PN} += "libmirage.so.12 \
libmirage12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libmirage-3-3"

inherit rpm
