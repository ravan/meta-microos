SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) network functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjacknet0-1.9.22-5.5.aarch64.rpm"
RPM_HASH = "770b4e8b1892d290618b0ca578d31780cb208831bb35be3d14672f62cfd165330a5ba883c5bf081eb608160d4edb0755771deaecedc1bf7cdc2a95f5e2488e1f"

RPROVIDES:${PN} += "libjack0-/usr/lib64/libjacknet.so.0* \
libjacknet.so.0 \
libjacknet0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
