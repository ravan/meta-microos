SUMMARY = "Documentation for texlive-cartonaugh"
DESCRIPTION = "This package includes the documentation for texlive-cartonaugh"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn59938"

RPM_NAME = "texlive-cartonaugh-doc-2026.226.1.0svn59938-59.2.noarch.rpm"
RPM_HASH = "cb97b5b37db27018a8773f0cd44a6b944e770eed0aa812068f50c8b0384a9958ecb49a6a5e3465eb203e1d9158ca5c5857f8f4aafe0aafc710b24191ae3db44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cartonaugh-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
