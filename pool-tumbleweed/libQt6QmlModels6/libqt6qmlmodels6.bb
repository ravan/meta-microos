SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlModels6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d8700f3a0dcca7af00b054c46ea431ea78ddbb37e25c5edf684070a88b47c272d92567c6eecd86a57c42184851d3b250f0a51ab017ccb3497a92fdae4dd5caf3"

RPROVIDES:${PN} += "libQt6QmlModels.so.6 \
libQt6QmlModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
