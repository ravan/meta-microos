SUMMARY = "Documentation for texlive-pdfsync"
DESCRIPTION = "This package includes the documentation for texlive-pdfsync"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20373"

RPM_NAME = "texlive-pdfsync-doc-2026.226.svn20373-58.2.noarch.rpm"
RPM_HASH = "e6982ddf547f8d5fcd2431c0adfc7005b2e0ccdc644aba8b580348ab0cd69b6d86cb70327ec1ad02b3f712cd935810aeebaf5361d900d3d102970d9606702ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfsync-doc"

RDEPENDS:${PN} += ""

inherit rpm
