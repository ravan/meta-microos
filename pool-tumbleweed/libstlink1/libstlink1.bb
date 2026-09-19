SUMMARY = "Shared library for stlink"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "libstlink1-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "e3fc8e360d512979605e18199507313af2acc143f1b15cee7264f9c8815db3c1854bac1bf5edf123e321533358d66d904a5a868660d7d683625ac617e6ec0833"

RPROVIDES:${PN} += "libstlink.so.1 \
libstlink1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
