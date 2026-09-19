SUMMARY = "Development files for libancient"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libancient."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "ancient-devel-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "b3a17bdcf3753fe039f2c2e49e519e81c7a9427062ec37f60c81af2752e097f18c95570fcd1889ed7d4b3700ee42f2bbd479738f90fe08d985406b7e403bc0e9"

RPROVIDES:${PN} += "ancient-devel \
pkgconfig-libancient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libancient2"

inherit rpm
