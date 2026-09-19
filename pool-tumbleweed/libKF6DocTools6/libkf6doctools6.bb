SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "6.30.0"

RPM_NAME = "libKF6DocTools6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "610ea21d19a89e0b43d35764bf6042ea8145fa76c615946cd8f1ea76240e334051188ad0449d6dee4cdc5b9d31b4353380acc816a6ffc44fd2affafb2c7c38ba"

RPROVIDES:${PN} += "libKF6DocTools.so.6 \
libKF6DocTools6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kdoctools \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
