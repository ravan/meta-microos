SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "libudev1-261.2-1.2.aarch64.rpm"
RPM_HASH = "51693a3095f666a274020db9f3148f028794b1beea92c71c6066abfda52434f61f038ebb03de9cef41db2c01c69a4576f01a9055c4cdf309cd43500215a395c8"

RPROVIDES:${PN} += "libudev.so.1 \
libudev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
