SUMMARY = "Berkeley Open Infrastructure For Network Computing library"
DESCRIPTION = "The Berkeley Open Infrastructure for Network Computing (BOINC) is a \
software platform which supports distributed computing."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "8.2.15"

RPM_NAME = "libboinc8-8.2.15-2.1.aarch64.rpm"
RPM_HASH = "5798d6cee8fa4718be586ba1376f67b321683cec9358e679827ebc09da37afd931636b9fe35f3faec7fa80ab80f3b22cd3dd80adee4aa65fd58ee60b96f63bc0"

RPROVIDES:${PN} += "libboinc-crypt.so.8 \
libboinc.so.8 \
libboinc8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
