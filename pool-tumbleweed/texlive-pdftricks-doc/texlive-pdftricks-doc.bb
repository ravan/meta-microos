SUMMARY = "Documentation for texlive-pdftricks"
DESCRIPTION = "This package includes the documentation for texlive-pdftricks"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.16svn15878"

RPM_NAME = "texlive-pdftricks-doc-2026.226.1.16svn15878-58.2.noarch.rpm"
RPM_HASH = "9098b04e403d9e5ccec13651e6cae3789a9b7604d0cd48687722935f4dcc8d3382b0fc21d3cb256bade8a9a4e2fddee50891bc0ded65fcb4d5f76fd23b8b333d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
