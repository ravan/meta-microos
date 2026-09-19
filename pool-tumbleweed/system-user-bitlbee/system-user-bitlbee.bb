SUMMARY = "System user and group bitlbee"
DESCRIPTION = "System user for use by the bitlbee service"
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "system-user-bitlbee-3.6-5.11.aarch64.rpm"
RPM_HASH = "05924d82a4116ca45dbb3ce1d80d8d9f17259fa573519a7e564d6253e19683e1f329f0c54bf78297f1952bc3e25afd8dde1097185d1bddee3961354d2ae73191"

RPROVIDES:${PN} += "group-bitlbee \
system-user-bitlbee \
user-bitlbee"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
