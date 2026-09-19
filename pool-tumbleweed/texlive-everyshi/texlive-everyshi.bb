SUMMARY = "Take action at every \\shipout"
DESCRIPTION = "This package provides hooks into \\sshipout called \\EveryShipout \
and \\AtNextShipout analogous to \\AtBeginDocument. With the \
introduction of the LaTeX hook management this package became \
obsolete in 2020 and is only provided for backwards \
compatibility. For current versions of LaTeX it is only mapping \
the hooks to the original everyshi macros. In case you use an \
older LaTeX format, everyshi will automatically fall back to \
its old implementation by loading everyshi-2001-05-15."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.00svn77682"

RPM_NAME = "texlive-everyshi-2026.226.4.00svn77682-59.2.noarch.rpm"
RPM_HASH = "c8a311e48b3f7f8242aace8ff165aafc858fb0ddeb92d45aa71d0df8983b7dee9ee12dc967c66b3ac31b6e3882714e47a5ede7a7291781436a7df65a1bd683f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everyshi-2001-05-15.sty \
tex-everyshi.sty \
texlive-everyshi"

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
