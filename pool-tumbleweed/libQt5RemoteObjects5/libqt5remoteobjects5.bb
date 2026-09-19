SUMMARY = "Qt 5 RemoteObjects Library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5RemoteObjects5-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "807309ef94b5d3121f57cc536771d0fc1e0e382388dff9b690beba19c7015296f427320cb0254d08926697d54abd704dcfa8704704d4f9855338300a71f9ef31"

RPROVIDES:${PN} += "libQt5RemoteObjects.so.5 \
libQt5RemoteObjects5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
