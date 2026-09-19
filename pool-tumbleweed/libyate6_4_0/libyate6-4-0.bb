SUMMARY = "Shared libraries for Yate"
DESCRIPTION = "Yate is a telephony engine. Its focus is on Voice over Internet \
Protocol (VoIP) and PSTN. It can be extended. Voice, video, data and \
instant messenging can be unified under Yate's routing engine."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "libyate6_4_0-6.4.0-6.6.aarch64.rpm"
RPM_HASH = "89a4f32309e340bd27c7bb6da38605b6ad3d89cb48973ba7d9722fa05e6818b6812b57eb7427549a17e3e3ab87e541b6b88c12cb7fa6010a530e1c2c91e40078"

RPROVIDES:${PN} += "libyate.so.6.4.0 \
libyate6-4-0 \
libyateasn.so.6.4.0 \
libyatejabber.so.6.4.0 \
libyatemgcp.so.6.4.0 \
libyateradio.so.6.4.0 \
libyatescript.so.6.4.0 \
libyatesig.so.6.4.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
