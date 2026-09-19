SUMMARY = "Macros for Manuscript Preparation for AAS Journals"
DESCRIPTION = "The package provides a document class for preparing papers for \
American Astronomical Society publications. Authors who wish to \
submit papers to AAS journals are strongly urged to use this \
class in preference to any of the alternatives available."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0.1svn75970"

RPM_NAME = "texlive-aastex-2026.226.7.0.1svn75970-61.2.noarch.rpm"
RPM_HASH = "9b07629eb68905271690021215e2afb441d6fd02f9b01ff6f955b04a2202ca22427c696693ffc35cfa311465675806d034b75c6f04ea60876d04daa4e7f55757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aastex701.cls \
texlive-aastex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-epsf.sty \
tex-fleqn.clo \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-latexsym.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-natbib.sty \
tex-rotating.sty \
tex-textcase.sty \
tex-times.sty \
tex-ulem.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
