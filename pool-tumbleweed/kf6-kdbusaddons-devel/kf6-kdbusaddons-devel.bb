SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdbusaddons-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c0c8e13b6b64a2956803f5b60fb0c72377132529be3da487e49ef0b5d43586a4a11be22e9e4f5faf91d5a9213aa9356f32ba1e50db2e7bfc386256ca4999d6d7"

RPROVIDES:${PN} += "cmake-KF6DBusAddons \
kf6-kdbusaddons-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
kf6-extra-cmake-modules \
libKF6DBusAddons6"

inherit rpm
