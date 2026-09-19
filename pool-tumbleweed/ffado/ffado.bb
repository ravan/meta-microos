SUMMARY = "FireWire 1394 support for audio devices"
DESCRIPTION = " \
FFADO provides a generic solution to support FireWire (IEEE1394, \
iLink) based (semi-)professional audio interfaces. It provides Linux \
with at least the same level of functionality that is present on the \
other operating systems. The range of FireWire Audio Devices \
supported ranges from pure audio interfaces over mixed audio-control \
devices to DSP algorithm devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ffado-2.4.9-4.5.aarch64.rpm"
RPM_HASH = "31e0b8ab69d754938491f2a98c0c9b8f63e72c1edb1ee11b205f93cbf88c49eb717cf0a9e996d4f3b21386c0cfa7b8ba5c476656429c9b650656ef412485403c"

RPROVIDES:${PN} += "ffado"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-c++-1.so.1 \
libffado.so.2 \
libffado2 \
libgcc-s.so.1 \
libiec61883.so.0 \
libm.so.6 \
libraw1394.so.11 \
libstdc++.so.6"

inherit rpm
