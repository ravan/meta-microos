SUMMARY = "GUI for STM32 discovery line linux programmer"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "stlink-gui-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "851b2f7753be8172f1b09412c901955e9189b8c0734e6d6abab08d25f9b8bac4434ed05e62a97419aa4a81f7260b36a75f586151649bc8418f0b2b7602fadd32"

RPROVIDES:${PN} += "stlink-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstlink.so.1 \
stlink"

inherit rpm
