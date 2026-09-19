SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations. This package contains the \
library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6PkPass6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7f0058e11706694e5020b51194adfc08bf4a644b92a74541e449387eb8f3a52dfb516acd3456fbd8130328dc06ae9ebfeec09af9084b24592e266a11882c0093"

RPROVIDES:${PN} += "libKPim6PkPass.so.6 \
libKPim6PkPass6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kpkpass \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
