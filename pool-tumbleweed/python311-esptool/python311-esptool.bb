SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "python311-esptool-5.2.0-1.1.noarch.rpm"
RPM_HASH = "03c76ea0d5028547977476529f13e73ccae4aa06b3c92561e67eb8f37f12c03bdbb0fb767a47d08198655143d7ec7b9fac6a64bc9f3134bf89d7012541073c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-esptool \
python311-esptool \
python3dist-esptool"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-bitstring \
python311-click \
python311-cryptography \
python311-intelhex \
python311-pyserial \
python311-reedsolo \
python311-rich-click \
update-alternatives"

inherit rpm
