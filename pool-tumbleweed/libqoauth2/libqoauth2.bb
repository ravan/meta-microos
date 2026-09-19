SUMMARY = "Library for interaction with OAuth-powered network services"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "libqoauth2-2.0.0-4.8.aarch64.rpm"
RPM_HASH = "8fa6e755699e8e71f903a8ab78fac5fe953820f7bffde7e8384cbd1fa58185510fa173921fefa2b83da720781266bc124a0ae85ce9b0b48ce6a72b72424310ad"

RPROVIDES:${PN} += "libqoauth.so.2 \
libqoauth2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
