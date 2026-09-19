SUMMARY = "Table library for libime"
DESCRIPTION = "This package provides table library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "libIMETable0-1.1.13-1.5.aarch64.rpm"
RPM_HASH = "99143e7525a9afaf5d6b76d40efb0e4661a4b12fe79ab95502113021d11e0a1076e9c856a88ca00c65ff2ae21570a40c62e066f2c0cf4a9758eb802047a982bd"

RPROVIDES:${PN} += "libIMETable.so.0 \
libIMETable0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libime-dicts \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
