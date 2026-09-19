SUMMARY = "Documentation for texlive-gcard"
DESCRIPTION = "This package includes the documentation for texlive-gcard"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-gcard-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "a0b3b9503d17300116bf3e957997317c57c445090ca26396e16fbb1cad4d0514d7f8b8b9ab45ca4c645e81e5982549d7570ea707278afb8e7ada44d70d7b302d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
