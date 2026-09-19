SUMMARY = "Documentation for texlive-rterface"
DESCRIPTION = "This package includes the documentation for texlive-rterface"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn30084"

RPM_NAME = "texlive-rterface-doc-2026.226.svn30084-60.2.noarch.rpm"
RPM_HASH = "8f900479b0cdab2294ef7dd9384df875cc897184b466d2c5479dd81b56becce06720798f07072dfdc1bd206476e06695fbb563f1f55ae02a97e969b02612f363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rterface-doc"

RDEPENDS:${PN} += ""

inherit rpm
