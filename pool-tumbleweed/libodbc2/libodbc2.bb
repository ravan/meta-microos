SUMMARY = "Open Database Connectivity API"
DESCRIPTION = "ODBC is an API that abstracts the access to different database \
management systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.14"

RPM_NAME = "libodbc2-2.3.14-1.7.aarch64.rpm"
RPM_HASH = "c18f321d744b8fa8068820435b60f78521d44c0863641c908b0bac536d0d6a88fce10f5fdb9c95a8379d33b87b1a6d552bc0242b29cb9f713701b4fc4cacafa4"

RPROVIDES:${PN} += "libodbc.so.2 \
libodbc2 \
libodbccr.so.2 \
libodbcinst.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7"

inherit rpm
