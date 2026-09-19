SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.8"

RPM_NAME = "python313-spidev-3.8-1.7.aarch64.rpm"
RPM_HASH = "f38cf823ae2f988b69e85e2083d08b7a0a59dd77b0d95e49e665c902e2478edfe63af0ae71bfb6ff411091d2609e3fdcab0fd83c0afd4d2f8d14882e840cd179"

RPROVIDES:${PN} += "python3-spidev \
python3.13dist-spidev \
python313-spidev \
python3dist-spidev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
