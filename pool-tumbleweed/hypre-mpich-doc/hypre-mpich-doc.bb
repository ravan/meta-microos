SUMMARY = "Development documentation for Hypre"
DESCRIPTION = "This package contains development documentation for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-mpich-doc-3.1.0-1.2.noarch.rpm"
RPM_HASH = "452b0d0b7b392ce179ae06e0143af1207ce0c1b839fca6f4406caf7b219747fd60ce8d7f85a92cd17bef4f9544a1ca48d18b377b146bf6b6e1199ce2bd61d5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-mpich-doc"

RDEPENDS:${PN} += ""

inherit rpm
