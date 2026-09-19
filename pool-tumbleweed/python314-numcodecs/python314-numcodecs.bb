SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.16.5"

RPM_NAME = "python314-numcodecs-0.16.5-2.3.aarch64.rpm"
RPM_HASH = "e8f1d7a0f6f52d3bc50f8823e071b10d4c820c76448f48803214367c80e19a4952b61be0f2ad900f1994fabb2e75888adf2e5f5ae0e337697c4fae0a7b82c645"

RPROVIDES:${PN} += "python3.14dist-numcodecs \
python314-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python314-numpy \
python314-typing-extensions"

inherit rpm
