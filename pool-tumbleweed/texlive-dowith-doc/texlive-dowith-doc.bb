SUMMARY = "Documentation for texlive-dowith"
DESCRIPTION = "This package includes the documentation for texlive-dowith"
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.32svn38860"

RPM_NAME = "texlive-dowith-doc-2026.226.r0.32svn38860-59.2.noarch.rpm"
RPM_HASH = "45038ecc707384222c9f3075f4d7040db7a7b5daf564466cd1eb0460e9346399fd924a8d2064038cb0f11badb4b0485d6f146640a2edae210de23a033f3db23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dowith-doc"

RDEPENDS:${PN} += ""

inherit rpm
