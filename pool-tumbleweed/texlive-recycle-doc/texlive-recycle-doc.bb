SUMMARY = "Documentation for texlive-recycle"
DESCRIPTION = "This package includes the documentation for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-recycle-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "878dd8b909fe426beca6f407691617009a67dbb8b514710b19a4d619201bbb19a514efc91ed10b615ecfc15c234edfed6bb6aad0cfcac93725396fe9b1265084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
