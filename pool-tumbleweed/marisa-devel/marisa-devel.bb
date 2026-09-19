SUMMARY = "Development files for marisa"
DESCRIPTION = "The marisa-devel package contains libraries and header files for \
developing applications that use marisa."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "marisa-devel-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "c9f47043c9252b36808ffd967ed03dcd76c28948c235b5bad136047f590c26ca738dd7bc771655661a33bdf3e1ef80bfd277608d993a8731370c0b5fc3f59e09"

RPROVIDES:${PN} += "cmake-Marisa \
marisa-devel \
pkgconfig-marisa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
marisa \
python3-marisa"

inherit rpm
