SUMMARY = "PipeWire integration for KDE Plasma - recording support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the library needed for video and audio capture."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "libKPipeWireRecord6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "4965039922c65356b9d643dc5a53b68245ebcbb1063bec40a04ffbc1b54623bf6259755153d67fe0772a792c9d709b767576c46e22b0df36f5f4b2587d7eb536"

RPROVIDES:${PN} += "libKPipeWireRecord.so.6 \
libKPipeWireRecord6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKPipeWire.so.6 \
libKPipeWireDmaBuf.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
