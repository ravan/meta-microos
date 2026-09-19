SUMMARY = "Documentation for texlive-ifmslide"
DESCRIPTION = "This package includes the documentation for texlive-ifmslide"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-doc-2026.226.0.0.47svn20727-60.2.noarch.rpm"
RPM_HASH = "30990cdb5a319090e8555caae8fb064dd53356e7d2eee3ac04fef91b718864ede793dc0bb8191b4dd6927da466a03797fbb174956cfe8aeb1352dce99cde372c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
