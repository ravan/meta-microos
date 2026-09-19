SUMMARY = "Qt 6 TaskTree library"
DESCRIPTION = "Qt Task tree is a generic framework for automatic management of asynchronous tasks."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6TaskTree6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "280493042ce2497e998b50aa97cf1503ca6ff11430fd897490021af413ee8db8870bf4ef29bfde997a9e94d5b2598847b02cb889802388c1d5361cca34c0bc40"

RPROVIDES:${PN} += "libQt6TaskTree.so.6 \
libQt6TaskTree6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
