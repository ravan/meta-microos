SUMMARY = "Qt library for Single Sign On"
DESCRIPTION = "This package contains the Qt library for Single Sign On."
LICENSE = "LGPL-2.1-only"

PV = "1.16git.20231124T162152~18557f7"

RPM_NAME = "libaccounts-qt6-1-1.16git.20231124T162152~18557f7-1.10.aarch64.rpm"
RPM_HASH = "8404080b126a223ca34bc55561cef1aed2a84eef01aa59078dda6dea1a8de81b2c224b82a9ed92b805ab0b729a16635cf20dbdb86ca4f3e64552cc629228833c"

RPROVIDES:${PN} += "libaccounts-qt6-1 \
libaccounts-qt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libaccounts-glib.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
