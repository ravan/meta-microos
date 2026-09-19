SUMMARY = "Development documentation for Hypre"
DESCRIPTION = "This package contains development documentation for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-openmpi4-doc-3.1.0-1.3.noarch.rpm"
RPM_HASH = "f8c5f8673f789a6f520f3e4ba2956400130d3ef94332e453c0073c34ab39ffd272ae40e82a6cfca31a30407751b45b256b76e8a113b752f81bb630711d7028c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-openmpi4-doc"

RDEPENDS:${PN} += ""

inherit rpm
