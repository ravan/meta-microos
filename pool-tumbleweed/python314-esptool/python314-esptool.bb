SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.1"

RPM_NAME = "python314-esptool-5.3.1-1.2.noarch.rpm"
RPM_HASH = "759d6c98fbac4197146a1686b0542dc67515b2294e05b220579103b0894e7f4bea5620a4f2dbc5922d17557a3dc843ff2a589aae189339ac7a2f81768cd1064b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-esptool \
python314-esptool \
python3dist-esptool"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-bitstring \
python314-click \
python314-cryptography \
python314-intelhex \
python314-pyserial \
python314-reedsolo \
python314-rich-click \
update-alternatives"

inherit rpm
