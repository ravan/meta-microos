SUMMARY = "Helper class for single-instance policy applications"
DESCRIPTION = "KDSingleApplication is a helper class for single-instance policy applications."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "libkdsingleapplication-qt6-1_2-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "6756100a17aeda92be4e5e009e2c02c2c38e9149ed5258955bc6d19f5c43d0a05603b947c5fdff51f2700ff143e1fb1699ef7764a268f173d5a9ac99b7f6daee"

RPROVIDES:${PN} += "libkdsingleapplication-qt6 \
libkdsingleapplication-qt6-1-2 \
libkdsingleapplication-qt6.so.1.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
