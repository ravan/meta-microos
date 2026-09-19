SUMMARY = "Examples for Hypre"
DESCRIPTION = "This package contains examples for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-examples-3.1.0-1.3.noarch.rpm"
RPM_HASH = "cb762be96852ffa937837019ae8afc6cb91dcfd125b9985bcb03c3e3e19a7253dff96f51445d1e0f87ded35aab3fc6b37c555d478a743f07d27f003e04ea3a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-examples"

RDEPENDS:${PN} += ""

inherit rpm
