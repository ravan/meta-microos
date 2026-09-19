SUMMARY = "Toolkit for libime"
DESCRIPTION = "This package provides toolkit for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "libime-tools-1.1.13-1.5.aarch64.rpm"
RPM_HASH = "0e0284da2bc3d0504914f6a23fb2467ac744f05cd2f0d8ad7ac6a7f7ffbb010809045e7025caf19aced7353d25b07532e5905b48f0489516dcbb933bfa25a34b"

RPROVIDES:${PN} += "libime-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libIMEPinyin.so.0 \
libIMETable.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
