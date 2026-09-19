SUMMARY = "FRRouting snmp library"
DESCRIPTION = "This library contains part of the net-snmp agentx implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrrsnmp0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "d6c1d870062b1fd21d8a48279d433ac61cddf087221cbddc75c2c51462f236c444397abf3aa091dd74407af584c28f562cf4de063950182e9052ff75c3db6217"

RPROVIDES:${PN} += "libfrrsnmp.so.0 \
libfrrsnmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45"

inherit rpm
