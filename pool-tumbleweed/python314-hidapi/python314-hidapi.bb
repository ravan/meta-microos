SUMMARY = "A Cython interface to the hidapi from https://githubcom/libusb/hidapi"
DESCRIPTION = "A Cython interface to the hidapi from https://github.com/libusb/hidapi"
LICENSE = "BSD-3-Clause & GPL-3.0"

PV = "0.14.0.post2"

RPM_NAME = "python314-hidapi-0.14.0.post2-2.7.aarch64.rpm"
RPM_HASH = "ad5e9c12819d77bb7fe9fbe89492e335f3be8ea68c5aa244c78535905aba0980e1d57a26c4ae017b19bf5653b2f2b1a4b7e3bfc37c52eedb482a84647a6a8d8a"

RPROVIDES:${PN} += "python3.14dist-hidapi \
python314-hidapi \
python3dist-hidapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi \
python314-Cython0"

inherit rpm
