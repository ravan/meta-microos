SUMMARY = "Library for analyzing sound and recommending volume change"
DESCRIPTION = "libreplaygain is a library that analyzes input samples and gives the \
recommended volume change."
LICENSE = "LGPL-2.1-or-later"

PV = "r475"

RPM_NAME = "libreplaygain1-r475-3.9.aarch64.rpm"
RPM_HASH = "881098053e6ab972b6dedf696d78d302b8ab9d49a5da45da1e23c77748c6907bdb6566dc2b0081c74d55ea51f60dcfbf87ebcd9ab71fb61e6e3332b4963b8c45"

RPROVIDES:${PN} += "libreplaygain.so.1 \
libreplaygain1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
