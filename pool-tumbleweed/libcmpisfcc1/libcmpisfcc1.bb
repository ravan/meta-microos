SUMMARY = "Common Manageability Programming Interface of the Small Footprint CIM Client"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "libcmpisfcc1-2.2.9~rc1-1.11.aarch64.rpm"
RPM_HASH = "12011d26457b99754cb4455dd98c27e0b952d9c48ff3eefbb09f37509fde893d11c606a70600b4172fa2fcb9d908d61b2a847520fc719354fc9a32d3cba505c4"

RPROVIDES:${PN} += "libcmpisfcc.so.1 \
libcmpisfcc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcimcclient.so.0"

inherit rpm
