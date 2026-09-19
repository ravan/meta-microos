SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of \
non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpackage-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2cbdcf1db8fd2b084971ce3d5f0a2eece7527cc68ed06612a8a452fa68bdf9c55bb1e3ffd4d30784a2d3b8f5b8bbaa0be1ce5d95cce3b13fb8fe109c6ff9b9e3"

RPROVIDES:${PN} += "kf6-kpackage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Package.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
