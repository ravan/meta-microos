SUMMARY = "Qt library for Single Sign On"
DESCRIPTION = "This package contains the Qt library for Single Sign On."
LICENSE = "LGPL-2.1-only"

PV = "1.16git.20231124T162152~18557f7"

RPM_NAME = "libaccounts-qt5-1-1.16git.20231124T162152~18557f7-1.10.aarch64.rpm"
RPM_HASH = "b545c040e75e4e05f3993dfbd20f11c379b449b6d6211a763b9c775f43d5f28f6ca1a519f30a53ccb730d508814bff40b49ffefd07a19e9329b62e58e113d1b6"

RPROVIDES:${PN} += "libaccounts-qt5-1 \
libaccounts-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libaccounts-glib.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
