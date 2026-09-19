SUMMARY = "Documentation for texlive-evangelion-jfm"
DESCRIPTION = "This package includes the documentation for texlive-evangelion-jfm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.5_csvn69751"

RPM_NAME = "texlive-evangelion-jfm-doc-2026.226.1.0.5_csvn69751-59.2.noarch.rpm"
RPM_HASH = "ea4027cfbca7e18b55c454b362fd90db9103bd33f94f8bda72c186e5251c455c6e11910bcb587e3816d6a0b8bfc130d3f8f01bb58ae4f50755cc0c330b2ec328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-evangelion-jfm-doc-ja;zh \
texlive-evangelion-jfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
