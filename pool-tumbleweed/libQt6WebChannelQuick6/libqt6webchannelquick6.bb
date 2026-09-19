SUMMARY = "Qt 6 WebChannelQuick library"
DESCRIPTION = "The Qt 6 WebChannelQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebChannelQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9e604d725177e9086887cadf5ecb7fc055de40e32000c7f365f60590bb518be8a7d7c42f9cb7409576b6a0a18cdb00bcec64e72fa27e70e4394f5dd02488807c"

RPROVIDES:${PN} += "libQt6WebChannelQuick.so.6 \
libQt6WebChannelQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebChannel.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
