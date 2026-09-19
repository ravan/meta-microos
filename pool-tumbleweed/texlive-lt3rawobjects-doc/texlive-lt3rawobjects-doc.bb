SUMMARY = "Documentation for texlive-lt3rawobjects"
DESCRIPTION = "This package includes the documentation for texlive-lt3rawobjects"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3svn76924"

RPM_NAME = "texlive-lt3rawobjects-doc-2026.226.2.3svn76924-59.2.noarch.rpm"
RPM_HASH = "8ac84758e461236b97fc203cfb88451faa314ae0e92d94689bac7f3f9ff64f2fdb94130d55707f25d0ed693e787c7ec14bb2a9a51bc60ced70c71d2f1b626af1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3rawobjects-doc"

RDEPENDS:${PN} += ""

inherit rpm
