SUMMARY = "Documentation for texlive-breakcites"
DESCRIPTION = "This package includes the documentation for texlive-breakcites"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-breakcites-doc-2026.226.svn78101-59.2.noarch.rpm"
RPM_HASH = "64e709a2b0c1c59f4012a83ceaca8b85f5e9e51f521a7b0eecf187179d561d32532d4d87c98fe431dbce5f25379151407c458183cff2dea6be80b5a591aa7c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breakcites-doc"

RDEPENDS:${PN} += ""

inherit rpm
