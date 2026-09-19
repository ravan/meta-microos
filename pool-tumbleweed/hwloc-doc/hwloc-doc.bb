SUMMARY = "Documentation for hwloc"
DESCRIPTION = "This package contains the documentation for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "hwloc-doc-2.13.0-1.3.noarch.rpm"
RPM_HASH = "1acbb12c9b1ebc2ce25ab150d1c7d80d015655bc3f56a5a7cd03c8d4d297e10fc8b4ea79f82a24d5771b0ebb1a383a0fde16523f434010ad7598b1c89f32b4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
