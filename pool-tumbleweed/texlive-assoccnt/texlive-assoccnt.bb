SUMMARY = "Associate counters, making them step when a master steps"
DESCRIPTION = "The package provides the means of declaring a set of counters \
to be stepped, each time some 'master' counter is stepped."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn38497"

RPM_NAME = "texlive-assoccnt-2026.226.0.0.8svn38497-60.2.noarch.rpm"
RPM_HASH = "1cf859cda089c28ad32949c4cac1a893754d58c5d56e8cedb703ba29c21f813501ed92c4adebc4e0084d0c4d710356b9c905c5cd821ad518b9cb1672a2195cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assoccnt.sty \
texlive-assoccnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
