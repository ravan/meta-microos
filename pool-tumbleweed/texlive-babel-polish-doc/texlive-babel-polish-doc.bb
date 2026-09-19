SUMMARY = "Documentation for texlive-babel-polish"
DESCRIPTION = "This package includes the documentation for texlive-babel-polish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-babel-polish-doc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "c668cc715dc2e7c1276462ac1304c79931b639a89baf0da91943cab41ebb763d107d56a62fbfde77003f5db7bfdb1c182210ec86c7855f998c32d5e1ef37cea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
