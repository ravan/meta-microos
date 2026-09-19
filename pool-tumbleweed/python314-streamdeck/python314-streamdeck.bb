SUMMARY = "Library to control Elgato StreamDeck devices"
DESCRIPTION = "Python library to control Elgato StreamDeck devices."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python314-streamdeck-0.9.8-1.4.noarch.rpm"
RPM_HASH = "7440b09da94e8edae78f968e2d646f02e0a09c283cc36bbebd440f79f3bf5d7ae4b88acd7c2cf52fadb1e22bc0ea4945c5597b1ffc530c903920a9c2d596fb0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-streamdeck \
python314-streamdeck \
python3dist-streamdeck"

RDEPENDS:${PN} += "libhidapi-libusb0 \
python-abi"

inherit rpm
