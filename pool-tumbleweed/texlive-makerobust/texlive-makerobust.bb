SUMMARY = "Making a macro robust (legacy package)"
DESCRIPTION = "Heiko Oberdiek's makerobust package defined a command with name \
\\MakeRobustCommand that could be used to make fragile commands \
robust. The LaTeX format has, since 2015, included a command \
\\MakeRobust with the same syntax and behaviour. Also by 2019, \
almost all commands in LaTeX that may be used in a moving \
argument are already robust. This package is now just a simple \
one-liner defining the name \\MakeRobustCommand as an alias for \
\\MakeRobust. This package should not be used in any new \
documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn78101"

RPM_NAME = "texlive-makerobust-2026.226.2.0svn78101-59.2.noarch.rpm"
RPM_HASH = "4454842d7ae23677df9464d3f3186d9ac516b70de3e7b89d8d0548e9902098dc61ea2f12886b07af8300f86bf3ee4254aea7edf38121c045f87b6ba0f30b7235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makerobust.sty \
texlive-makerobust"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
