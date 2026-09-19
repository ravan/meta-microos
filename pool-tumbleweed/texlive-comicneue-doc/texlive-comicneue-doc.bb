SUMMARY = "Documentation for texlive-comicneue"
DESCRIPTION = "This package includes the documentation for texlive-comicneue"
LICENSE = "OFL-1.1"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-comicneue-doc-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "18342231ad0d24817f5d53cf2ca59cc7d5996920dd30db07c1f6ef6a9c34f938559b9de276a3552f7766120a43b52b93bda19d9cfa5f46f81bf7dffad421526e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comicneue-doc"

RDEPENDS:${PN} += ""

inherit rpm
