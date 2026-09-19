SUMMARY = "Adwaita Qt6 library"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt6-1-1.4.2-4.11.aarch64.rpm"
RPM_HASH = "b3424bbac43456aa1a8d71b7beae479714a2220ad5dba7881ca63e89ff66f448863bac060705da12c2c83f95e7463be812d79078ff7dec9055beea278ecb6e08"

RPROVIDES:${PN} += "libadwaitaqt6-1 \
libadwaitaqt6.so.1 \
libadwaitaqt6priv.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
