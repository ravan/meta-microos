SUMMARY = "Documentation for texlive-zref-clever"
DESCRIPTION = "This package includes the documentation for texlive-zref-clever"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn77682"

RPM_NAME = "texlive-zref-clever-doc-2026.226.0.0.5.1svn77682-59.4.noarch.rpm"
RPM_HASH = "43442f684e0005c4400b0d8297ed9a095c768de1996cfc589d5113e0593a50c734273ba744fdf24ae9fc47b2501cd694454c88a6be5bbf31fb149038f193c1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-clever-doc"

RDEPENDS:${PN} += ""

inherit rpm
