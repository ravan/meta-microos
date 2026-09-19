SUMMARY = "Flash Program for the STM32 Bootloader"
DESCRIPTION = "Open source flash program for the STM32 ARM processors using the ST \
serial bootloader over UART or I2C. \
 \
Features: \
- UART and I2C transports supported \
- device identification \
- write to flash/ram \
- read from flash/ram \
- auto-detect Intel HEX or raw binary input format with option to force \
  binary \
- flash from binary file \
- save flash to binary file \
- verify & retry up to N times on failed writes \
- start execution at specified address \
- software reset the device when finished if -R is specified \
- resume already initialized connection (for when reset fails, UART only) \
- GPIO signalling to enter bootloader mode (hardware dependent)"
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "stm32flash-0.7-1.14.aarch64.rpm"
RPM_HASH = "b3aab152bf2e2bcee8dfc0b9c1b998256c443e111248d5af264a701d559b4b8219a401990b263eecf686d5e448693425ecadc4029d4be50240d43d5c4f6aee88"

RPROVIDES:${PN} += "stm32flash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
