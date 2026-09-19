SUMMARY = "STM32 discovery line linux programmer"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "stlink-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "88da6933a995bd45b67fdbc722fec2ca62f6f97f606cff063554b2aa673f0b1375b00ca22c025b2c1af04b0f5e92e487db77903f07fcd5a739e93234074f3027"

RPROVIDES:${PN} += "stlink"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstlink.so.1 \
udev"

inherit rpm
