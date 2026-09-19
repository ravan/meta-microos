SUMMARY = "Documentation for texlive-tuzuk"
DESCRIPTION = "This package includes the documentation for texlive-tuzuk"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn74620"

RPM_NAME = "texlive-tuzuk-doc-2026.226.1.0.0svn74620-59.2.noarch.rpm"
RPM_HASH = "f65920333ccd7b69e71870c65a459fe4297551aeecbba4cba693c2b14b98c55d60d5040902bde03e1aeb8e494e970b16b51b9dca74dff7a4016763b742c641ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tuzuk-doc"

RDEPENDS:${PN} += ""

inherit rpm
