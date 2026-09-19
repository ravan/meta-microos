SUMMARY = "Documentation for texlive-snaptodo"
DESCRIPTION = "This package includes the documentation for texlive-snaptodo"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70676"

RPM_NAME = "texlive-snaptodo-doc-2026.226.svn70676-64.2.noarch.rpm"
RPM_HASH = "3579280d3f424abce6c6c4e47035bfbc36c87c70ae48f23111f4335b96a9ce4e59d7578739e715ed7e1997d811c69af6876077d91a64df087a0f1b2241cc96ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snaptodo-doc"

RDEPENDS:${PN} += ""

inherit rpm
