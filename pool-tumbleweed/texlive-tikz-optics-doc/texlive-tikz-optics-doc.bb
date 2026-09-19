SUMMARY = "Documentation for texlive-tikz-optics"
DESCRIPTION = "This package includes the documentation for texlive-tikz-optics"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.3svn62977"

RPM_NAME = "texlive-tikz-optics-doc-2026.226.0.0.2.3svn62977-59.2.noarch.rpm"
RPM_HASH = "4879c166ceb2f03af6e38f9534917abc782bc0588edbf2a3b391d62aa9952208b911e6c172e6bb4bdf508ee87dcc154a747c853b90185a351dd9bb4fc03eb6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikz-optics-doc-fr \
texlive-tikz-optics-doc"

RDEPENDS:${PN} += ""

inherit rpm
