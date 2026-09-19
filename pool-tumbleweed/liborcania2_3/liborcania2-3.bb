SUMMARY = "MISC function library"
DESCRIPTION = "Different functions for different purposes but that can be shared \
between other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.3"

RPM_NAME = "liborcania2_3-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "ad2511a8646427c26559f25a60d77a635e2743bda462ce85fd3abd4ad44fb7fd65c42e49b7b04b84069342b4dccedea0cc7b2273706bcfa2f06a5b876ca21e84"

RPROVIDES:${PN} += "liborcania.so.2.3 \
liborcania2-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
