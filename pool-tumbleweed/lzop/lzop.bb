SUMMARY = "Dictionary-based LZ-type compressor favoring speed"
DESCRIPTION = "lzop is a general-purpose file compressor similar to gzip. \
It favors higher compression and decompression speed at the cost \
of compression ratio. \
 \
lzop was designed with the following goals in mind: \
- speed (both compression and decompression) \
- reasonable drop-in compatibility to gzip \
- portability"
LICENSE = "GPL-2.0-or-later"

PV = "1.04"

RPM_NAME = "lzop-1.04-4.22.aarch64.rpm"
RPM_HASH = "fd6de5048c634eefb0b0d03587a7858b92cecf48ba26070678211cbc9e8643ff9c565b9c08aa89a71e611b40624ebffa7d8426d7b5643f5b51cb48acbcab0f8d"

RPROVIDES:${PN} += "lzop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2"

inherit rpm
