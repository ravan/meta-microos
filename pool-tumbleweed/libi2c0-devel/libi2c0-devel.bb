SUMMARY = "Development files for the I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4"

RPM_NAME = "libi2c0-devel-4.4-3.5.aarch64.rpm"
RPM_HASH = "2dd01c4ee5c24d13a8374e67237664df07fa350382eb0fda8d74398dbfb566fe9aa074e79ed448388c39df0a1b99dd71ed08bfb55d2af11455d5c8a3ab618f80"

RPROVIDES:${PN} += "/usr/include/i2c/smbus.h \
libi2c0-devel"

RDEPENDS:${PN} += "glibc-devel \
libi2c0"

inherit rpm
