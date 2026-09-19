SUMMARY = "Documentation for texlive-frame"
DESCRIPTION = "This package includes the documentation for texlive-frame"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18312"

RPM_NAME = "texlive-frame-doc-2026.226.1.0svn18312-60.2.noarch.rpm"
RPM_HASH = "418f2bb4cf5087eeb46cf8bd8e933ff8263fb3792c778d6034ffe2b92a4b846996dc992ba185e37abd5919c06fae6358e5a8955a42db4c5edb01f8925c9a67e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frame-doc"

RDEPENDS:${PN} += ""

inherit rpm
