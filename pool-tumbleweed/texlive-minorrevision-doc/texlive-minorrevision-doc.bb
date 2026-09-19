SUMMARY = "Documentation for texlive-minorrevision"
DESCRIPTION = "This package includes the documentation for texlive-minorrevision"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32165"

RPM_NAME = "texlive-minorrevision-doc-2026.226.1.1svn32165-61.2.noarch.rpm"
RPM_HASH = "d02ec30ae35ec453df231f5441f4ad506879b73aa70eeb0a66be631f66c2617919569fe13135caea3676dc95d0825ddf77490740fd0819599b4ba1d25a0febe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minorrevision-doc"

RDEPENDS:${PN} += ""

inherit rpm
