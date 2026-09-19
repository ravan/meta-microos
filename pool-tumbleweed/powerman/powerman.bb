SUMMARY = "Centralized Power Control for Clusters"
DESCRIPTION = "PowerMan is a tool for manipulating remote power control (RPC) devices from a \
central location. Several RPC varieties are supported natively by PowerMan and \
Expect-like configurability simplifies the addition of new devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "powerman-2.4.4-3.3.aarch64.rpm"
RPM_HASH = "b0e5b2bb17ab2d06b12300b7bb53c4cb5fe2c7ff961cc045be3dc52f071c496d8f4b704f793d399bc603255b37f63f9410edd347adff79b3a0b433097158d227"

RPROVIDES:${PN} += "config-powerman \
group-powerman \
powerman \
user-powerman"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjansson.so.4 \
libnetsnmp.so.45 \
libwrap.so.0 \
shadow \
systemd"

inherit rpm
