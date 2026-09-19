SUMMARY = "Development files for dealii-openmpi4"
DESCRIPTION = "The dealii-openmpi4-devel package contains libraries and header files for \
developing applications that use dealii-openmpi4."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.1"

RPM_NAME = "deal_II-openmpi4-devel-9.7.1-2.2.aarch64.rpm"
RPM_HASH = "3a049f11bbce56abca75e621e063c90bc2784cf70ca5899b36b31be65e784ca659efb9e2a379431bfc4124791d97a5f413075d7638a060ee24737cafbf495dfd"

RPROVIDES:${PN} += "deal-II-openmpi4-devel \
dealii-openmpi4-openmpi4-devel"

RDEPENDS:${PN} += "libdeal-II9-7-1-openmpi4"

inherit rpm
