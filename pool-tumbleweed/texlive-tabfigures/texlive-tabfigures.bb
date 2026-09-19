SUMMARY = "Maintain vertical alignment of figures"
DESCRIPTION = "Knuth designed his original fonts with tabular figures (figures \
whose width is uniform); this makes some layout problems rather \
simple. In more recent times, fonts (such as Minion Pro), which \
offer proportionally spaced figures, are increasingly being \
used. The package provides mechanisms whereby such proportional \
figures may still be aligned in tabular style (for example, in \
the table of contents)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn25202"

RPM_NAME = "texlive-tabfigures-2026.226.1.1svn25202-64.2.noarch.rpm"
RPM_HASH = "66e94e7aa9a87378d441126bd5d7041ef73e5df0567e3e720399901253ddb269c975ea09773a03905a308933b421aebf4d0facfc4021fb11c98ce2cd59e1bf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabfigures.sty \
texlive-tabfigures"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
