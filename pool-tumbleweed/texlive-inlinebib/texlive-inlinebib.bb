SUMMARY = "Citations in footnotes"
DESCRIPTION = "A BibTeX style and a LaTeX package that allow for a full \
bibliography at the end of the document as well as citation \
details in footnotes. The footnote details include 'op. cit.' \
and 'ibid.' contractions."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22018"

RPM_NAME = "texlive-inlinebib-2026.226.svn22018-60.2.noarch.rpm"
RPM_HASH = "75d2367bad17d1341491ca98082ff8f70dda8d9773b1f0a5e0aaf3df3c7127845afbc1dbbf054599f4c87cc268eb0b1d25df9f1c1f2c1de4511026bf3dfa086e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinebib.sty \
tex-pageranges.sty \
texlive-inlinebib"

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
