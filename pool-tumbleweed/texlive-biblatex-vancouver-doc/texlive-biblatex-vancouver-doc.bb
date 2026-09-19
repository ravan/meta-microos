SUMMARY = "Documentation for texlive-biblatex-vancouver"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-vancouver"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn75301"

RPM_NAME = "texlive-biblatex-vancouver-doc-2026.226.0.0.1svn75301-61.2.noarch.rpm"
RPM_HASH = "b88fb90b2a79b03cab4369f396cfa086aa2a697e4e4f3e26ccd506fc09eae8fd818c9942da56daacfd7da649d7fb8d6cab1fb64994fd22bf74903743be7b40ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-vancouver-doc"

RDEPENDS:${PN} += ""

inherit rpm
