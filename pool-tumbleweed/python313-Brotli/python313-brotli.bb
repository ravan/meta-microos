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

RPM_NAME = "python313-Brotli-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "ee074108eb792902fd2036d2a83ced4bf1ea339a3d41fa0f668f60bfcb3c8fa358d8f5e3e6728742c0557e2d17508aedae80161d46cf84828d7c3db95e8aa08f"

RPROVIDES:${PN} += "python3-Brotli \
python3.13dist-brotli \
python313-Brotli \
python3dist-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
