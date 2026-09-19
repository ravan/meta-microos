SUMMARY = "Documentation for texlive-luamaths"
DESCRIPTION = "This package includes the documentation for texlive-luamaths"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn76924"

RPM_NAME = "texlive-luamaths-doc-2026.226.1.6svn76924-59.2.noarch.rpm"
RPM_HASH = "c04fca7d2005170e0108eb7f1c1020a578449f00281073faf58af09ac2858e3678499040e4fc58892084412f3af8a866daa6562a3f84e8ff4d7440abfe54832e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamaths-doc"

RDEPENDS:${PN} += ""

inherit rpm
