SUMMARY = "Logging for C++"
DESCRIPTION = "Logging facilities providing library."
LICENSE = "LGPL-2.1-only"

PV = "1.1.6"

RPM_NAME = "liblog4cpp5-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "91e26c46758baa7e3dcf0162a711c0c21fde09971b87c34315ceafd81a671784a2d4fbc55a3099a9bb6467bae532c97595d5bdd351eb51e159c0ad3b1198f187"

RPROVIDES:${PN} += "liblog4cpp.so.5 \
liblog4cpp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
