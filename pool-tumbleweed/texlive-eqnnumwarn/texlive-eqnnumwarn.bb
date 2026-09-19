SUMMARY = "Modifies the amsmath equation environments to warn for a displaced equation number"
DESCRIPTION = "Sometimes an equation is too long that an equation number will \
be typeset below the equation itself, but yet not long enough \
to yield an overfull \\hbox warning. The eqnnumwarn package \
modifies the standard amsmath numbered equation environments to \
throw a warning whenever this occurs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-eqnnumwarn-2026.226.1.0svn75878-61.4.noarch.rpm"
RPM_HASH = "80d88c932b19acb6bc982d90cdab88893cf527a9769a8a5cf97b2b30fd4494bff8b4c880c98379243690cf20b7e602b20d5093fa137660440f79a645c7854954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnnumwarn.sty \
texlive-eqnnumwarn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
