SUMMARY = "Documentation for texlive-gckanbun"
DESCRIPTION = "This package includes the documentation for texlive-gckanbun"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.7svn77307"

RPM_NAME = "texlive-gckanbun-doc-2026.226.2.2.7svn77307-60.2.noarch.rpm"
RPM_HASH = "e062062880bb1355120ac0d499f751e26210ee538a1072f6c7392e184a35738233c9fb13bec4f6ed705d40e8d087db6e073d0a70724ae4edfa47a05456811f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gckanbun-doc-ja \
texlive-gckanbun-doc"

RDEPENDS:${PN} += ""

inherit rpm
