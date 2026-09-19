SUMMARY = "Create ROR symbols which links to the given ROR-IDs"
DESCRIPTION = "This package provides an easy to use command. It takes an URL \
of the Research Organization Registry (ROR) as argument and \
creates a ROR symbol which links to the given URL -- very \
similar to the orcidlink package from which it is derived. The \
symbol itself always fits with the chosen font size."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn76790"

RPM_NAME = "texlive-rorlink-2026.226.1.1.0svn76790-60.2.noarch.rpm"
RPM_HASH = "2a5ed9e40847c020c99e9d8becddaac6f1961fff5136e3e8c94179aabe98fee265a3160ec1d9be2bac53e821861a101480e9ff517621610d152ec6f97b07a8bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rorlink.sty \
texlive-rorlink"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
