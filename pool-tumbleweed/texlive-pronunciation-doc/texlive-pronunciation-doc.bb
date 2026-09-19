SUMMARY = "Documentation for texlive-pronunciation"
DESCRIPTION = "This package includes the documentation for texlive-pronunciation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn73701"

RPM_NAME = "texlive-pronunciation-doc-2026.226.1.0.2svn73701-59.2.noarch.rpm"
RPM_HASH = "d61308864bb55f7f94e2779e00d93aaec66838cae4c1c3cf7f21ee8bd50f93465811a6c27e98b2cfb6e5eb918da4181311e96121ae9b36b0b53efe7a5f36690a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pronunciation-doc-ja \
texlive-pronunciation-doc"

RDEPENDS:${PN} += ""

inherit rpm
