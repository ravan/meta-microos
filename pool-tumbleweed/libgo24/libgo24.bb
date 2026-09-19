SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "15.3.0+git11272"

RPM_NAME = "libgo24-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "1f065cd18fd5500517a9a8be02b41a219aac6d9942b6b0ec7f4c182b18a48ed7d9ab294a7945308ac191fca4631b0533421a0bae3b99b7ca1e6ed016e3ac7485"

RPROVIDES:${PN} += "libgo.so.24 \
libgo24"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
