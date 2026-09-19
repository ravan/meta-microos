SUMMARY = "CUPS Driver Development Kit"
DESCRIPTION = "The CUPS Driver Development Kit (DDK) provides \
a suite of standard drivers, a PPD file compiler, \
and other utilities that can be used to develop \
printer drivers for CUPS."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "cups-ddk-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "334bc34bc8d9fc55e7913aaccfa96dd9a12400e58df2057ed16e5c384cee61a31adbf4ef02600823f2d881add39bf8998e5f0ec539eaf60de2cb5c9a4946912d"

RPROVIDES:${PN} += "cups-ddk \
cupsddk"

RDEPENDS:${PN} += "cups \
cups-devel \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
