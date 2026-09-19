SUMMARY = "Libyui - The REST API plugin for the Qt frontend"
DESCRIPTION = "This package provides a libyui REST API plugin for the Qt frontend. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API. This is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-rest-api16-4.7.7-1.1.aarch64.rpm"
RPM_HASH = "b50f325da04574bc65763b423fa7cfd3e8428e69d50467c4672d58f7266ea5440132ddea1015a46e04705babc3e049c63cf3355fa8750430dd6c2af60ababde3"

RPROVIDES:${PN} += "libyui-qt-rest-api \
libyui-qt-rest-api.so.16 \
libyui-qt-rest-api16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui-qt16 \
libyui-rest-api16 \
libyui.so.16 \
libyui16 \
yui-backend"

inherit rpm
