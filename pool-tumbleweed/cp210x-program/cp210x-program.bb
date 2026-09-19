SUMMARY = "EEPROM tool for Silabs CP210x USB-Serial adapters"
DESCRIPTION = "The CP210x is an USB-to-serial chip used in a lot of USB devices (similar to \
FTDIs and PL2303). The CP210x has a EEPROM on the chip which can be programmed \
with this tool via USB."
LICENSE = "LGPL-2.1-only"

PV = "0.4.1"

RPM_NAME = "cp210x-program-0.4.1-1.9.noarch.rpm"
RPM_HASH = "f7db5356bafd244559f628dbda187014af3111928d7ead982febf9d2b936ed82b65a4ae0373cb8de27065a9b92b2494c57273d4013577302e18232bf5a5d965a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cp210x-program \
python3.13dist-cp210x-program \
python3dist-cp210x-program"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-pyusb"

inherit rpm
