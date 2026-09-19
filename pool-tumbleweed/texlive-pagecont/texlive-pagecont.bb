SUMMARY = "Page numbering that continues between documents"
DESCRIPTION = "The package provides the facility that several documents can be \
typeset independently with page numbers in sequence, as if they \
were a single document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-pagecont-2026.226.1.0svn15878-58.2.noarch.rpm"
RPM_HASH = "239211ba7cfdae9dd0f272e2d2d6d6de905330b8f189481c1747707605baeef103e5eb28492aaee6831c8b7ffb335acc1533bf76c0a4fb9652391135b60c20ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagecont.sty \
texlive-pagecont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
