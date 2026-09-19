SUMMARY = "Documentation for texlive-smartref"
DESCRIPTION = "This package includes the documentation for texlive-smartref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-smartref-doc-2026.226.1.9svn77682-64.2.noarch.rpm"
RPM_HASH = "234118f703b110dce9ef7047a14a50741a558702cf466f497b4d5ba900c5237bf4f68fc232c5757f4407dd0116338ea8a945090b84bfc3f6e5f2f813b433e60a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartref-doc"

RDEPENDS:${PN} += ""

inherit rpm
