SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "python314-libusb1-3.4.0-1.2.noarch.rpm"
RPM_HASH = "fcf24930499b54817c47195ff9fba0d6474989df6ded5e2d50807423a1ca642c21bc2bab7a75b6bd74e708f5189240f18cbd71700c094378b667cbd409663625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libusb1 \
python314-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
