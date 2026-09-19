SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdesu-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5fb3ac66f39b82e1eb9912206d2f0d686a22abb76ccfa0c85a6eedca3614c3d71557c48826b5edb18cc5644f5f2343dfed1bf17284c094d90bc4e4c2bb9989d2"

RPROVIDES:${PN} += "kf6-kdesu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Su.so.6 \
libQt6Core.so.6 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
