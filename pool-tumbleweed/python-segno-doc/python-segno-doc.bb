SUMMARY = "Documentation files for python-segno"
DESCRIPTION = "Man page for python-segno."
LICENSE = "BSD-3-Clause"

PV = "1.6.6"

RPM_NAME = "python-segno-doc-1.6.6-1.5.noarch.rpm"
RPM_HASH = "bb8b44d96d44f56e913d47dbf20a8a694ebb2e54bf7ead936d41985e5db92938af02c7b5c6531a8150c688ca20789b514c07f6c1f4269bba0f212e20be662e14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-segno-doc"

RDEPENDS:${PN} += ""

inherit rpm
