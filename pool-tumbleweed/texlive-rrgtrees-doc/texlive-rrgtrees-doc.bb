SUMMARY = "Documentation for texlive-rrgtrees"
DESCRIPTION = "This package includes the documentation for texlive-rrgtrees"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn27322"

RPM_NAME = "texlive-rrgtrees-doc-2026.226.1.1svn27322-60.2.noarch.rpm"
RPM_HASH = "f8c3d85de36a35c5223086b5480faf743e16c53d811e4dede33efa29a2e62996b2d18a0acda99fb632292b59e2b213e9551b387dc6ae17fec57a46289e797da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rrgtrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
