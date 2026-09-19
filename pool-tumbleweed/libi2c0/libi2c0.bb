SUMMARY = "I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4"

RPM_NAME = "libi2c0-4.4-3.5.aarch64.rpm"
RPM_HASH = "51eb1ed7f90d681f70cd5c00421b20d6c228d657102bbf2b51a125eb43ac207854909adc4fa09fb1103d1d22a2b63afce0ffced90da859b91b069956a2aa22c9"

RPROVIDES:${PN} += "libi2c.so.0 \
libi2c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
