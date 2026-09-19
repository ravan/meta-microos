SUMMARY = "Documentation for texlive-thesis-gwu"
DESCRIPTION = "This package includes the documentation for texlive-thesis-gwu"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.7.0svn54287"

RPM_NAME = "texlive-thesis-gwu-doc-2026.227.1.7.0svn54287-62.2.noarch.rpm"
RPM_HASH = "74fae6170b8a947355e1a430ddb018ff2051f49ff94b14c291880170481574c7ef599337a04eac340f36ad67e314a076cc7464892343c3c45cf3a43dfe1f5ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thesis-gwu-doc"

RDEPENDS:${PN} += ""

inherit rpm
