SUMMARY = "Development files for libieee1284"
DESCRIPTION = "Development files for libieee1284, a Library for Interfacing IEEE \
1284-Compatible Devices."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.2.11"

RPM_NAME = "libieee1284-devel-0.2.11-2.10.aarch64.rpm"
RPM_HASH = "cc5cf3bbc60bdb490740df331de55a39d3b3f88d58f48d3a85ec81a64b87ae59aea866a3421fd950fceeb2a36dfacf7b36e471db2cfb05cdae7123010d329bdb"

RPROVIDES:${PN} += "libieee1284-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libieee1284-3 \
libieee1284.so.3"

inherit rpm
