SUMMARY = "Netfilter Extended Accounting utility"
DESCRIPTION = "This utility allows you to manipulate the extended accounting \
infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "nfacct-1.0.2-2.20.aarch64.rpm"
RPM_HASH = "5a681d799a51de155b22aaa90a7b5ae688dab10f035ea3e7813bbb540e3e63f192c6a62a46b4aea7475296c7fb3c558db185ef7dbf108762b5f0a2c008b850d8"

RPROVIDES:${PN} += "nfacct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-acct.so.1"

inherit rpm
