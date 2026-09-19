SUMMARY = "LZO plugin for dd_rescue"
DESCRIPTION = "This plugin allows you do de/compress files during recovery copying \
with dd_rescue using the lzo family of algorithms. lzo algorithms \
are very fast to decompress and most algorithms are very fast to \
compress as well -- at the expense of somewhat worse compression than \
zlib's deflate. \
 \
The plugin does offer a variety of options to handle corrupted .lzo \
files with some grace; it does skip over bad blocks (if the block \
headers are still intact) by default, but does offer an option (nodiscard) \
to allow to attempt decompression on faulty input, hoping to produce \
some usable bytes. It can also search for valid block headers after \
synchronization has been lost due to a corrupt one. \
 \
The plugin also handles sparse files (files with holes) and supports \
appending to .lzo files, so it fits neatly into dd_rescue. \
 \
Some fuzz testing has been applied to the plugin's decompression routines, \
though more will have to be done to feel confident about feeding untrusted \
data to the decompressor."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.22"

RPM_NAME = "dd_rescue-lzo-1.99.22-1.4.aarch64.rpm"
RPM_HASH = "ad1c6578b824af102144fbafb423fbbcb36fdb02adf158cadd59dc930b75e2228ba55decef95db709d5b11170fdd010d6f78b6d17aac180ec0876f95e230b5f7"

RPROVIDES:${PN} += "dd-rescue-lzo \
libddr-lzo.so"

RDEPENDS:${PN} += "dd-rescue \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2"

inherit rpm
