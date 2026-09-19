SUMMARY = "A heterogeneous set of I2C tools for Linux"
DESCRIPTION = "This package contains a heterogeneous set of I2C tools for Linux: a bus \
probing tool, a chip dumper, register-level access helpers, EEPROM \
decoding scripts, and more."
LICENSE = "GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "i2c-tools-4.4-3.5.aarch64.rpm"
RPM_HASH = "9e92dd21cd6778349e3f31266f8e09072e453e7d49385e1c20b19e7d7000571e5c53020b5bac2f753b081659cc6850f4ae2efc292c791c760d6c6995fde21510"

RPROVIDES:${PN} += "i2c-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libi2c.so.0 \
udev"

inherit rpm
