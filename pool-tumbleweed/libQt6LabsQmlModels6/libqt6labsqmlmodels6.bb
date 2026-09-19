SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsQmlModels6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "8ac13d026481a57de8f7e26b7b45abcac7f2195ae40e44791f4626c0915df2d220b0074a08391ac9354028474df9b009d9d06c6d2321ae44bb68b69b8c2a24e1"

RPROVIDES:${PN} += "libQt6LabsQmlModels.so.6 \
libQt6LabsQmlModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
