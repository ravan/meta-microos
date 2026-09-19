SUMMARY = "Documentation for texlive-prociagssymp"
DESCRIPTION = "This package includes the documentation for texlive-prociagssymp"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70888"

RPM_NAME = "texlive-prociagssymp-doc-2026.226.svn70888-59.2.noarch.rpm"
RPM_HASH = "4bde2601a06baecf0479c54785742844b7000655c7642421f31fd6491cfc50d0503474c878064a5bc1ff57f6cc7872a81f28cf7455103b9f698a214cd6a4c484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prociagssymp-doc"

RDEPENDS:${PN} += ""

inherit rpm
