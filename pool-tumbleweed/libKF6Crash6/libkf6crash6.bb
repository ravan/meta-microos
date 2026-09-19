SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Crash6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "24130e22f1ae9f89946310135fea9937e198efce04cd760fb3f5c60545767a22c59e79db51a838944a88baee69811256685e2b47aeb34bf05bb64237d7f9d48d"

RPROVIDES:${PN} += "libKF6Crash.so.6 \
libKF6Crash6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcrash \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
