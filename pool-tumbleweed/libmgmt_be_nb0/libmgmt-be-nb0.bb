SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains part of the mgmt_be implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libmgmt_be_nb0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "e8b036116d8a64c1e971d8b7c718b06b47a18f0bcfed4380d33fe4391e23a4503aeacae7bc9e4273af32a50dba89c8d00696f5474cb534bcf3b62d392cf53f9d"

RPROVIDES:${PN} += "libmgmt-be-nb.so.0 \
libmgmt-be-nb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libyang.so.3"

inherit rpm
