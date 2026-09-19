SUMMARY = "EchoLink library"
DESCRIPTION = "EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "libecholib1_3-1.3.7-7.1.aarch64.rpm"
RPM_HASH = "9718931bf26d375741ed316e12339eae1b818d2488a3e375b4ac044959752af07298594c6fd893e9ebe157c4c610d92380c5d22e8b10f181205db45294db3e68"

RPROVIDES:${PN} += "libecholib.so.1.3 \
libecholib1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasyncaudio.so.1.9 \
libasynccore.so.1.9 \
libc.so.6 \
libgcc-s.so.1 \
libgsm.so.1 \
libsigc-2.0.so.0 \
libspeex.so.1 \
libstdc++.so.6"

inherit rpm
