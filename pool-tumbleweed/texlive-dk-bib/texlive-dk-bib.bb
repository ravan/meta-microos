SUMMARY = "Danish variants of standard BibTeX styles"
DESCRIPTION = "Dk-bib is a translation of the four standard BibTeX style files \
(abbrv, alpha, plain and unsrt) and the apalike style file into \
Danish. The files have been extended with URL, ISBN, ISSN, \
annote and printing fields which can be enabled through a LaTeX \
style file. Dk-bib also comes with a couple of Danish sorting \
order files for BibTeX8."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn76790"

RPM_NAME = "texlive-dk-bib-2026.226.0.0.6svn76790-59.2.noarch.rpm"
RPM_HASH = "7c6157e840011e91ab7a062a921d11f9c65566beaa2b3d2ccbceadcfe67f8814b4b6d3240e43d75422088432fe8d6de50688db1d4bf74ef269ddf8690e57552b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dk-apali.sty \
tex-dk-bib.sty \
texlive-dk-bib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
