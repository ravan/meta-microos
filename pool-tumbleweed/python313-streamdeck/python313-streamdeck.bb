SUMMARY = "Library to control Elgato StreamDeck devices"
DESCRIPTION = "Python library to control Elgato StreamDeck devices."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python313-streamdeck-0.9.8-1.4.noarch.rpm"
RPM_HASH = "b76fca44052e1e1702728d08c0e4cdad6f7ca1552cd49a45ab826cb95ddb3f352906ac41e8df86bf11998a9a837ef98a498d49839cd7d793d90d97de629e31cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-streamdeck \
python3.13dist-streamdeck \
python313-streamdeck \
python3dist-streamdeck"

RDEPENDS:${PN} += "libhidapi-libusb0 \
python-abi"

inherit rpm
