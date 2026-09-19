SUMMARY = "Documentation for texlive-latexdemo"
DESCRIPTION = "This package includes the documentation for texlive-latexdemo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn67201"

RPM_NAME = "texlive-latexdemo-doc-2026.226.0.0.2svn67201-61.2.noarch.rpm"
RPM_HASH = "d07c8622a0379e9ed464acd86c3dfa3375e7a501ac0d65e3750a769352ba64ea2dbe1cdccd707dfdae556c0f00120c1835f9ace793b105af9b04ebb3934ad258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexdemo-doc"

RDEPENDS:${PN} += ""

inherit rpm
