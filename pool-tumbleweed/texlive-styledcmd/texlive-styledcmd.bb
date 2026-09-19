SUMMARY = "Handling multiple versions of user-defined macros"
DESCRIPTION = "This package allows creating and maintaining different versions \
of the same command, in order to choose the best option for \
every document. This includes expandable and protected \
commands."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.1svn76924"

RPM_NAME = "texlive-styledcmd-2026.226.2.0.1svn76924-64.2.noarch.rpm"
RPM_HASH = "9600651b09a2076187d044e2ff0f7c6c9a2a5f51ea942d6dc3352ce40a8ba2107a63846446f211f6683f52a8e5e0730d44a2ac7ac6b379646f0f813aadfd9921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-styledcmd.sty \
texlive-styledcmd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-lt3rawobjects.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
