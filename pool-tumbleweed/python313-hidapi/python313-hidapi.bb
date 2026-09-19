SUMMARY = "A Cython interface to the hidapi from https://githubcom/libusb/hidapi"
DESCRIPTION = "A Cython interface to the hidapi from https://github.com/libusb/hidapi"
LICENSE = "BSD-3-Clause & GPL-3.0"

PV = "0.14.0.post2"

RPM_NAME = "python313-hidapi-0.14.0.post2-2.7.aarch64.rpm"
RPM_HASH = "265d46c0c809f963ba1dbb6d67a0a3fe25e84a6ef547ffb42481b9bb7ed35433869064239ef8670b70107b4ac8544e8b41c38737821feac88fb0471c487ff92a"

RPROVIDES:${PN} += "python3-hidapi \
python3.13dist-hidapi \
python313-hidapi \
python3dist-hidapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi \
python313-Cython0"

inherit rpm
