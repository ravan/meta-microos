SUMMARY = "Examples for Hypre"
DESCRIPTION = "This package contains examples for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-openmpi5-examples-3.1.0-1.2.noarch.rpm"
RPM_HASH = "62ecfa2ba42a80e150232160c9606cb11bebb6424c2f9f51a1f0dc59a3dc6a5817d450660fede14f3a02fb3d6c81633b381b9f969e813c369a0623a802e33f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-openmpi5-examples"

RDEPENDS:${PN} += ""

inherit rpm
