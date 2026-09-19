SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "libqca-qt6-2-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "eb9d59b14862c42a178a8131a4a46bc80890ea55a563aa587e60fdd00d13c2ecef55d2248d46b184e19cdcfb36956f4da8d25d546c96c0aa4e89efd60c72f620"

RPROVIDES:${PN} += "libqca-qt6-2 \
libqca-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qca-qt6"

inherit rpm
