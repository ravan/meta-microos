SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Su6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "98d3dd24f35a6acea0577472212bba2934e7943737cd79156175ac1fd85543d39bad1dc9a5878ce8ef2dc145d994ae904f2388d68097a83128f3f47eaa8d01f2"

RPROVIDES:${PN} += "libKF6Su.so.6 \
libKF6Su6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kdesu \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Pty.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
