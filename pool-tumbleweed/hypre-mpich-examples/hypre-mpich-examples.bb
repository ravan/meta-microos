SUMMARY = "Examples for Hypre"
DESCRIPTION = "This package contains examples for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-mpich-examples-3.1.0-1.2.noarch.rpm"
RPM_HASH = "b762bde1f8d2d8c792da23dfb2a272772412427b9bcf5f3142a64ce07db2f94d1ecf12b7d825255ac578c52dda92708d534b20afd3148c855b0516c175c85de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-mpich-examples"

RDEPENDS:${PN} += ""

inherit rpm
