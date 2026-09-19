SUMMARY = "Documentation for squirrel"
DESCRIPTION = "Documentation files for squirrel."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-doc-3.2-4.6.noarch.rpm"
RPM_HASH = "1b5d336919f748b6c834176af773660996f28400457e14be2db12e893db2a9683f1f09c2d8c556c92902b050fbd85a3109ec5f4f452c56baa6a121f3f4363e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squirrel-doc"

RDEPENDS:${PN} += ""

inherit rpm
