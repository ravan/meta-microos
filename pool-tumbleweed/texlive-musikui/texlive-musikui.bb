SUMMARY = "Easy creation of 'arithmetical restoration' puzzles"
DESCRIPTION = "This package permits to easily typeset arithmetical \
restorations using LaTeX. This package requires the graphicx \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn47472"

RPM_NAME = "texlive-musikui-2026.226.1svn47472-61.2.noarch.rpm"
RPM_HASH = "013bdf01ba7cc8ba8d50daed9c5fee3021062fec5779ceffa8f489b9c390bfb07f27a872f4582a96e2fef6f60e8a24594304301e729f1b04944ae6fae8bccd60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musikui.sty \
texlive-musikui"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
