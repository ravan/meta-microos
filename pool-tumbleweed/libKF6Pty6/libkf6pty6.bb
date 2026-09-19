SUMMARY = "Interfacing with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Pty6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2ad10f418b888b76c83b98d42548a35ed3df34afb9c758b37ce69fd64795a1a6240032b91a2aa0268f395a84e21d58b4c605ce77c8fee5ab7873bbafe3107cdd"

RPROVIDES:${PN} += "libKF6Pty.so.6 \
libKF6Pty6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kpty \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
