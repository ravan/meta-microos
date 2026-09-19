SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libm2log19-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "444028e5393515ea7c9b3a0a7196df400a8a4898429cf3e88f4b15a2f7358e4d3a41ad2110af60afa4827b86d5c31f89b8810294debebf300b733498fd455a47"

RPROVIDES:${PN} += "libm2log.so.19 \
libm2log19"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
