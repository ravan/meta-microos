SUMMARY = "KDE PIM Libraries: Identity Management - QtQuick library"
DESCRIPTION = "This package provides a shared library to build QtQuick interfaces for \
PIM identity management."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6IdentityManagementQuick6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "593a1d9cca7f30217c6a95be52c65aa3a052e42e206fcb8a2dc6af8df8eb832ff20097e3535a831db782bcfef77663528c0c2d049f061caa2fe9bf7536fee2ab"

RPROVIDES:${PN} += "libKPim6IdentityManagementQuick.so.6 \
libKPim6IdentityManagementQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementCore6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
