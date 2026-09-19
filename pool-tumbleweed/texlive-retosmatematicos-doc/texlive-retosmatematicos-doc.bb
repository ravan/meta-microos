SUMMARY = "Documentation for texlive-retosmatematicos"
DESCRIPTION = "This package includes the documentation for texlive-retosmatematicos"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn76358"

RPM_NAME = "texlive-retosmatematicos-doc-2026.226.1.1.1svn76358-60.4.noarch.rpm"
RPM_HASH = "8c998db8a6c2c5670a2bac92e3a07890f6558c361930c3421ac60964bfd0ef313702e8376095fe0ecce94bc48f61bd544e6f46f6184dc22baff59b0610b199c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-retosmatematicos-doc-es \
texlive-retosmatematicos-doc"

RDEPENDS:${PN} += ""

inherit rpm
