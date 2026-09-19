SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.16.5"

RPM_NAME = "python313-numcodecs-0.16.5-2.3.aarch64.rpm"
RPM_HASH = "e0f3e679a94346ef591673e46a7e338125e46acca42a6227ae48b928affa521c1c638a4c8e47c7e73c4e0cab126d6f88e7114e0a3c3086d500679945c3f42814"

RPROVIDES:${PN} += "python3-numcodecs \
python3.13dist-numcodecs \
python313-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python313-numpy \
python313-typing-extensions"

inherit rpm
