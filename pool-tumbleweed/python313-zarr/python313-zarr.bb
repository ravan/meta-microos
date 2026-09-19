SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python313-zarr-3.2.1-1.2.noarch.rpm"
RPM_HASH = "b21cbc7a7b8b6300f888946fbc2905a7383eeaf60ce0c0cbd258cb7aa2efff844982a97b2f7e7f0025a07c205adceeb62e1162a5c3841e3bb6cced914782c503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zarr \
python3.13dist-zarr \
python313-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-donfig \
python313-google-crc32c \
python313-numcodecs \
python313-numpy \
python313-packaging \
python313-typing-extensions"

inherit rpm
