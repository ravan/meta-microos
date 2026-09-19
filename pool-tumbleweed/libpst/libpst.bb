SUMMARY = "Library and utilities for reading Personal Storage Table files"
DESCRIPTION = "The libpst utilities include readpst, which can convert email messages \
to both mbox and MH mailbox formats, pst2ldif, which can convert the \
contacts to .ldif format for import into LDAP databases, and pst2dii, \
which can convert email messages to the DII load file format used by \
Summation."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-0.6.76-3.6.aarch64.rpm"
RPM_HASH = "648f44b538188f0b949457386fdea6a46ad1673e9db392ef5e61dd87538ae632d92a470ddfe73afbb306a84e799ab25c3e90d73ca5b3aceac7157903264919b4"

RPROVIDES:${PN} += "libpst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libpst.so.4 \
libstdc++.so.6"

inherit rpm
