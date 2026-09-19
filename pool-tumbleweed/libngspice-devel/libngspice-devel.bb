SUMMARY = "Development files for ngspice"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the development files."
LICENSE = "BSD-2-Clause"

PV = "46"

RPM_NAME = "libngspice-devel-46-1.2.aarch64.rpm"
RPM_HASH = "a6419ac560a7f0ea776f3beac51f1393cd1a7cb3f4e3c0f15afb6910f28efee2bd93c4478f37cd9737adb45e98b74ce9f04827488686978ee931ffe0785d554d"

RPROVIDES:${PN} += "libngspice-devel \
pkgconfig-ngspice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libngspice0"

inherit rpm
