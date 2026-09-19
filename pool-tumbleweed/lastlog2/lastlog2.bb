SUMMARY = "Reports most recent login of users"
DESCRIPTION = "pam_lastlog2 and lastlog2 are Y2038 safe versions of the old lastlog utility. pam_lastlog2 collects all data in a sqlite3 database and lastlog2 formats and prints the contents. The username, port, and last login time will be printed."
LICENSE = "BSD-2-Clause"

PV = "2.42.2"

RPM_NAME = "lastlog2-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "c75cc8451a9cfd363fc14dd231a55760943b6e45a02a0f5e6b876c3b10a449a3cec41634f42f91bc29d44aef22c37b838f5f54b32787bf5f731fe4b753ba1621"

RPROVIDES:${PN} += "lastlog2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblastlog2.so.2 \
libpam.so.0 \
pam-config"

inherit rpm
