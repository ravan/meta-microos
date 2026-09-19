SUMMARY = "Development documentation for Hypre"
DESCRIPTION = "This package contains development documentation for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-openmpi5-doc-3.1.0-1.2.noarch.rpm"
RPM_HASH = "44f4e20ba1900e550b4750bfe4fea0ba879238c7d5b1b1f93063b951d046e8daa271e098e2cc89966e8ccea4af627aa532e7518f55d23a390809de4a0bc1f765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-openmpi5-doc"

RDEPENDS:${PN} += ""

inherit rpm
