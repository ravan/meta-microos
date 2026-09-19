SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kdbusaddons-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "b50d16e187374363e78c350f06d746f26b0dbde987a773e1ce199dc6be29993c021819828f3029102d23338feaa62bf713a9c555eeb71a7216bc4a33094760f9"

RPROVIDES:${PN} += "cmake-KF5DBusAddons \
kdbusaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
libKF5DBusAddons5"

inherit rpm
