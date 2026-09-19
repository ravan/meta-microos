SUMMARY = "A 'lipsum' for Persian"
DESCRIPTION = "The package provides lipsum-like facilities for the Persian \
language. The source of the filling text is the Persian epic \
'the Shanameh' (100 paragraphs are used.) The package needs to \
be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-ptext-2026.226.1.1svn77682-60.4.noarch.rpm"
RPM_HASH = "c310e1a70942e7fdb54371747fb0e187b7b02cc01f15834d082c1286e410b355104e63447cb9d8861e7cbdb55fac1087c7f9f83b3a7c9c731673512b0196add0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptext.sty \
texlive-ptext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
