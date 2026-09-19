SUMMARY = "Development documentation for Hypre"
DESCRIPTION = "This package contains development documentation for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-doc-3.1.0-1.3.noarch.rpm"
RPM_HASH = "ad90308bde6959c10444502a818c9f98fde781e1ae84e36c2f51335e6be0aa59f91f80adaf03b88bd08f2d769c9ccff92e20d6b985ea326153ba43dc356fbdd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-doc"

RDEPENDS:${PN} += ""

inherit rpm
