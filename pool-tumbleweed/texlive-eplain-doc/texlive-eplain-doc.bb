SUMMARY = "Documentation for texlive-eplain"
DESCRIPTION = "This package includes the documentation for texlive-eplain"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.14svn71409"

RPM_NAME = "texlive-eplain-doc-2026.226.3.14svn71409-61.4.noarch.rpm"
RPM_HASH = "6e2de54e161ed7929a08ef912146a12d35f99048ac4c50b7717af54ca09c095bb46b95c2c83c6a59816bee425d09c714b972d22fd889f8710ee882a55b240679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eplain.1 \
texlive-eplain-doc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh"

inherit rpm
