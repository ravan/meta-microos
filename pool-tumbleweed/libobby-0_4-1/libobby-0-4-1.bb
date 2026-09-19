SUMMARY = "Synced document buffers"
DESCRIPTION = "obby is a library which provides synced document buffers. It supports \
multiple documents in one session and is portable to both Windows and \
Unix-like platforms. \
 \
 \
 \
Authors: \
-------- \
    Armin Burgmeier <armin@0x539.de> \
    Philipp Kern <phil@0x539.de>"
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "libobby-0_4-1-0.4.8-11.39.aarch64.rpm"
RPM_HASH = "d1ebed9c8c4da36f46301624b9405a4637aa6608d1c0cc4886ff0153019d827461d44e510f75a4d7a921708c0c0b250f2fc3c1da23bbefbc312067092afce306"

RPROVIDES:${PN} += "libobby-0-4-1 \
libobby-0.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libnet6-1.3.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
obby"

inherit rpm
