SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk. You can \
interactively browse the capture data, viewing summary and detailed \
information for each packet. Wireshark has several features, \
including a rich display filter language and the ability to view the \
reconstructed stream of a TCP session."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.6.8"

RPM_NAME = "wireshark-4.6.8-2.1.aarch64.rpm"
RPM_HASH = "c28f1fc63940e1c9d5d59dee61d9cc3569ff7b396fee8e2c6a6f12d4b8d0f9aa4586c0c380187d650c7af3d0c4c418c9e4dd808b6895996c886fabb46f657e5d"

RPROVIDES:${PN} += "group-wireshark \
wireshark"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbcg729.so.0 \
libc.so.6 \
libcap.so.2 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
liblz4.so.1 \
libm.so.6 \
libmaxminddb.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libopus.so.0 \
libpcap.so.1 \
libsbc.so.1 \
libspandsp.so.3 \
libspeexdsp.so.1 \
libssh.so.4 \
libsystemd.so.0 \
libwireshark.so.19 \
libwiretap.so.16 \
libwsutil.so.17 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
permissions \
shadow"

inherit rpm
