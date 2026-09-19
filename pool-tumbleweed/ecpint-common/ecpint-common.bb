SUMMARY = "Architecture independent data files for libecpint"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic. \
 \
This package contains architecture independent data files for libecpint"
LICENSE = "MIT"

PV = "v1.0.7+git20230218.8e788d4"

RPM_NAME = "ecpint-common-v1.0.7+git20230218.8e788d4-1.9.noarch.rpm"
RPM_HASH = "9e7827be40b69f912831a5df95eea3fca84610bd25930d1212d7a46a32cb4f3ed9f19c6330adb4828793191ebb065568dcbce2255a5d3aa2b970887145f9c74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ecpint-common"

RDEPENDS:${PN} += "libecpint1"

inherit rpm
