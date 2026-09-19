SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "python313-libusb1-3.4.0-1.2.noarch.rpm"
RPM_HASH = "315dfa2ae57c3742e57ecaede6e9516d2f2129ccc048162e892f8dd4519d856c9abe197bb123a8dfcf453c8c8e8de8c2cceeb836cdcaf194dd71fa2a4a17b218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libusb1 \
python3.13dist-libusb1 \
python313-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
