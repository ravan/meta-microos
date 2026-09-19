SUMMARY = "Libraries for foreign function call interfaces"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "libffcall0-2.5-1.9.aarch64.rpm"
RPM_HASH = "2df40fb47aef403ffd358109eb27e75cd59252825edbd17271f6d13bc4c4df1aad8c900a3040f54fbf9b8b330211020d520a7e0f9889addc1c81b784090b13d6"

RPROVIDES:${PN} += "libffcall.so.0 \
libffcall0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
