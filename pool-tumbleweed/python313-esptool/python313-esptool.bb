SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.1"

RPM_NAME = "python313-esptool-5.3.1-1.2.noarch.rpm"
RPM_HASH = "5a2569aa0339a66fbdf5c4eb77c822fb7376dd7cfe38ea5edc9f14c97f990c25751fc516810f3e05cbbac78fa628440e6ab6ceb7f755f3be12d818f3d6e6d939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-esptool \
python3.13dist-esptool \
python313-esptool \
python3dist-esptool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-bitstring \
python313-click \
python313-cryptography \
python313-intelhex \
python313-pyserial \
python313-reedsolo \
python313-rich-click \
update-alternatives"

inherit rpm
