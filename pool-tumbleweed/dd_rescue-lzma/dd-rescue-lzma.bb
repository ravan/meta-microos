SUMMARY = "LZMA (xz) de/compression plugin for dd_rescue"
DESCRIPTION = "This plugin allows you do de/compress files during recovery copying \
with dd_rescue using the lzma compression algorithm. The lzma algorithm \
is fairly slow when compressing, but achieves a good compression ratio. \
Decompression is much faster. \
 \
This plugin is still new and may not be very mature yet. It may be \
a bad idea to feed it with untrusted data, especially when running \
with elevated privileges. \
 \
Authors: \
-------- \
    Dmitrii Ivanov <dsivanov_9@edu.hse.ru> \
    Kurt Garloff <kurt@garloff.de>"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.22"

RPM_NAME = "dd_rescue-lzma-1.99.22-1.4.aarch64.rpm"
RPM_HASH = "e375bd9b757ac9642317e6587bfefdaeb4eb66f664dcf9238aefce603225db5ea40fda9f982a3ae372812bad2355fc51e73d54cf086d7d94315528b3010a1da4"

RPROVIDES:${PN} += "dd-rescue-lzma \
libddr-lzma.so"

RDEPENDS:${PN} += "dd-rescue \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm
