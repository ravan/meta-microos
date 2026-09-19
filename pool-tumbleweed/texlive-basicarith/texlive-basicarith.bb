SUMMARY = "Macros for typesetting basic arithmetic"
DESCRIPTION = "The package provides macros for typesetting basic arithmetic, \
in the style typically found in textbooks. It focuses on the \
American style of performing these algorithms. It is written \
mostly in low-level TeX, with the goal that it should run in \
either plain TeX or LaTeX, but there are two constructions that \
currently prevent this. It is highly configurable, with macros \
and lengths described in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn35460"

RPM_NAME = "texlive-basicarith-2026.226.1.1svn35460-60.2.noarch.rpm"
RPM_HASH = "ff8a4e5d81ae73e6151232a71bccc0e0640f92bfbbb31d323fd174474b995a81afb613469303b72937690635dd8ec3f29199b095ba97aca82756ab62e5dd8fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basicarith.sty \
texlive-basicarith"

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
