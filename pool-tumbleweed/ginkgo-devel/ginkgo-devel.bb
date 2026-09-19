SUMMARY = "Headers and sources for developing against ginkgo - a linear algebra library"
DESCRIPTION = "Ginkgo is a high-performance numerical linear algebra library for many-core \
systems, with a focus on solution of sparse linear systems. \
 \
This package provides the headers and sources needed for developing programs \
against ginkgo."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "ginkgo-devel-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "53a2f67a749d65b510836b818ccaf9b588e8e394e63dfe800f9121df8bf9141cc0fdaaf706d16ac201f8a82364cfb09c7838c9f4b458f260315c85184c7adbed"

RPROVIDES:${PN} += "cmake-Ginkgo \
ginkgo-devel \
pkgconfig-ginkgo \
pkgconfig-ginkgo-RelWithDebInfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-nlohmann-json \
cmake-yaml-cpp \
libginkgo1-10-0 \
metis-devel"

inherit rpm
