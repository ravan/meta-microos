SUMMARY = "Provides a horizontal timeline"
DESCRIPTION = "A timeline package that allows labelling of events with per-day \
granularity. Other features include relative positioning with \
unit specification, adjustable tick mark step size, and scaling \
to specified width."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67973"

RPM_NAME = "texlive-chronology-2026.226.2.0svn67973-60.2.noarch.rpm"
RPM_HASH = "d844b2f51093c60258ddf6219794c8af72a984edb7696bf03b64bffd3f07fced15acf2452c0fe7d6edda48515e067c4cfc4d6c93cde99094c2c5e03102b85510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chronology.sty \
texlive-chronology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
