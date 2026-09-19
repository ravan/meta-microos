SUMMARY = "Headers and sources for developing with blaspp"
DESCRIPTION = "This package provides the headers and sources needed for developing apps \
against blaspp."
LICENSE = "BSD-3-Clause"

PV = "2025.05.28"

RPM_NAME = "blaspp-devel-2025.05.28-1.5.aarch64.rpm"
RPM_HASH = "4d95782bc904e7641ac61a1f23fdeed284892a6853bf95ebe884573c1154d8ab7ccda976e74a1ebedcc1842c14f5061cc9886e33dae3d09cb7a7e958d1c8ea70"

RPROVIDES:${PN} += "blaspp-devel \
cmake-blaspp"

RDEPENDS:${PN} += "libblaspp2 \
pkgconfig-blas"

inherit rpm
