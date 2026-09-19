SUMMARY = "Documentation for texlive-froufrou"
DESCRIPTION = "This package includes the documentation for texlive-froufrou"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77682"

RPM_NAME = "texlive-froufrou-doc-2026.226.1.4.0svn77682-60.2.noarch.rpm"
RPM_HASH = "ff50955ccd8ba9a98c3798f579a0ba1a3098ed6ced9c09d8a9ccbf069cc26ae529de89109bc20e617c89ae4a94b05065023807af1e20bd5f84f850c40108fe58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-froufrou-doc"

RDEPENDS:${PN} += ""

inherit rpm
