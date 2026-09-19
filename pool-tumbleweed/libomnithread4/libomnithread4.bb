SUMMARY = "omniORB thread library"
DESCRIPTION = "Thread support library for omniORB."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.2"

RPM_NAME = "libomnithread4-4.3.2-1.10.aarch64.rpm"
RPM_HASH = "a21d61def09fb30188cccd38994d1567d0af86efd7b8304104d405de92c36e46452855ae01c83b54b535d085c390be932f0cd0033147c507c65bc3e793100b16"

RPROVIDES:${PN} += "libomnithread.so.4 \
libomnithread4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
