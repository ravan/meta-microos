SUMMARY = "Python bindings for the Brotli compression library"
DESCRIPTION = "Brotli is a generic-purpose lossless compression algorithm that compresses data \
using a combination of a modern variant of the LZ77 algorithm, Huffman coding \
and 2nd order context modeling, with a compression ratio comparable to the best \
currently available general-purpose compression methods. It is similar in speed \
with deflate but offers more dense compression. \
 \
The specification of the Brotli Compressed Data Format is defined in RFC 7932."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python314-Brotli-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "1647a4a0aa2616fe0ace9c508dba286e112d37306d8445278efc753810a713d371cd76834105fda4a237c24db9ca428f5b3926937784193fca71fb1f4eec561f"

RPROVIDES:${PN} += "python3.14dist-brotli \
python314-Brotli \
python3dist-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
