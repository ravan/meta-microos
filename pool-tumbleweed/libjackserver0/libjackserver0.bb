SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) server functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjackserver0-1.9.22-5.5.aarch64.rpm"
RPM_HASH = "a43d1dc937332fd162850e6f02d5986d6f8bafbfe7293ab33fe5e5cee94c006dd674fd8ddd133c19af3eb660be84e3dfd94cb401921739dfbdced44ae6a20b5e"

RPROVIDES:${PN} += "libjack0-/usr/lib64/libjackserver.so.0* \
libjackserver.so.0 \
libjackserver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libstdc++.so.6"

inherit rpm
