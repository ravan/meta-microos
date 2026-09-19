SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5SerialBus5-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "8f3e34018329f76775c5339b50d466232a6d88eeb76b5b4232af7e80d2fa56278336486e045b19f46b8972d74c1f93431a27cdffa7cd4124fe3c90e67b985e61"

RPROVIDES:${PN} += "libQt5SerialBus.so.5 \
libQt5SerialBus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5SerialPort.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
