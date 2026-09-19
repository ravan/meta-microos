SUMMARY = "Development files for Lattice Basis Reduction with libfplll"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfplll."
LICENSE = "LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "fplll-devel-5.5.0-1.8.aarch64.rpm"
RPM_HASH = "7c684b82ac497b015cf20587818eb2e14437697d6506fc3cd7bd0b40532c0430759e532558a58b2302d3b496f4b6f9d35426fa4aa219e2606ba4b03bfc40e3bd"

RPROVIDES:${PN} += "fplll-devel \
libfplll-devel \
pkgconfig-fplll"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplll9"

inherit rpm
