SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "kpackage-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "26be0b6a863572ae34c466cb8f951152f4f6c1ab393f5939218521e19df83566f9b4072520a0841d3f7b5234cd17429e4341d9befe58fe3b6c3939295607ffc5"

RPROVIDES:${PN} += "kpackage \
libKF5Package.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
