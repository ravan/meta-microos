SUMMARY = "GNU Aspell Library"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains the aspell library."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8.2"

RPM_NAME = "libaspell15-0.60.8.2-1.3.aarch64.rpm"
RPM_HASH = "096084b045c6781672c1c42fcc27eddfa29da2e1d1b96bff2e893859a156d6034898abe65d81263547fd7452f5cf3fafe1c1bbff2888cf2cb93b244e35f61a7c"

RPROVIDES:${PN} += "libaspell.so.15 \
libaspell15"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
