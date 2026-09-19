SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python314-pyusb-1.3.1-2.6.noarch.rpm"
RPM_HASH = "fa7233c7c23fc93520f54f3684b187f67a255eb228d271a8630e9994a445a7feb4b18dc72743203f6fc9a1ca6054146ae5db62d446108604709cb9367ba848bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyusb \
python314-pyusb \
python314-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
