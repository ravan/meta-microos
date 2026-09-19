SUMMARY = "Lxqt-globalkeys libraries"
DESCRIPTION = "lxqt-globalkeys main system library"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "liblxqt-globalkeys2-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "751155a2fce45eeda2bcf721ed313ebea47c877dd621dd9f56e804065446418c373c196b0287c6c4fb11e3003c5bd7837d79ef84818ebbcfa4408a6dda9f7e02"

RPROVIDES:${PN} += "liblxqt-globalkeys.so.2 \
liblxqt-globalkeys2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
