SUMMARY = "Library to create F2 filesystems"
DESCRIPTION = "This package contains a shared library to format F2 filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.16.0"

RPM_NAME = "libf2fs_format9-1.16.0-2.6.aarch64.rpm"
RPM_HASH = "0d84d1cb9b8e19d520cf1c06e81de058247eab96ff2f7574a109c488b06c45353592c51127f59c26c9200c530e4767a2caee71215f346ff1d46c5ddbfda7c2c1"

RPROVIDES:${PN} += "libf2fs-format.so.9 \
libf2fs-format9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libf2fs.so.10 \
libuuid.so.1"

inherit rpm
