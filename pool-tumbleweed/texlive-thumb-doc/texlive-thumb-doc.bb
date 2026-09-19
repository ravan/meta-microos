SUMMARY = "Documentation for texlive-thumb"
DESCRIPTION = "This package includes the documentation for texlive-thumb"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.0svn16549"

RPM_NAME = "texlive-thumb-doc-2026.227.1.0svn16549-62.2.noarch.rpm"
RPM_HASH = "649942a172d9c3ffa3c361af76116df62c833b568c134e87ac5d68a37416d2e735bd3971c392a4d9d6664afb8ebadc17e10255b4d4a063eefacc314ed941eb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumb-doc"

RDEPENDS:${PN} += ""

inherit rpm
