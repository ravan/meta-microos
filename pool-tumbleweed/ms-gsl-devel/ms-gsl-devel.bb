SUMMARY = "Development files for ms-gsl"
DESCRIPTION = "Development files for ms-gsl."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ms-gsl-devel-5.0.0-1.1.noarch.rpm"
RPM_HASH = "d699edfb3ef1063564df2cf6c7e223a4d43f4f10f613ceb4ab395fd7fc55c249cca4d2e7552e7e76b128a28b8c68b2f8ac155fb33e7e73bca867b82e91384061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-Microsoft.GSL \
ms-gsl-devel"

RDEPENDS:${PN} += ""

inherit rpm
