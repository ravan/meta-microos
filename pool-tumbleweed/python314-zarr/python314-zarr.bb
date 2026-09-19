SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python314-zarr-3.2.1-1.2.noarch.rpm"
RPM_HASH = "7119a1f9f422cc0bf7e84a61d345f68afc8171f892724fe004f97f6aba88233fc3acadf757073c7bf7a679bf784d8eaa3266ebc0cb63887badebc18e6eec6826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zarr \
python314-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-donfig \
python314-google-crc32c \
python314-numcodecs \
python314-numpy \
python314-packaging \
python314-typing-extensions"

inherit rpm
