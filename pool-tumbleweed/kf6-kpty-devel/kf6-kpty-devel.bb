SUMMARY = "Development files for kpty, a pseudo terminal device interface"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpty-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f3a73fabe06597500f728ced809f30d8bd6c3b70e9dbb4face7ce613d9ce35768832d8117f73fe020f9b98188d029224de87e55783c8c43ec86a7ce47d939f67"

RPROVIDES:${PN} += "cmake-KF6Pty \
kf6-kpty-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6Pty6"

inherit rpm
