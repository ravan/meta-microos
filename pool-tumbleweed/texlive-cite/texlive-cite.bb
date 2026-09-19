SUMMARY = "Improved citation handling in LaTeX"
DESCRIPTION = "The package supports compressed, sorted lists of numerical \
citations, and also deals with various punctuation and other \
issues of representation, including comprehensive management of \
break points. The package is compatible with both hyperref and \
backref. The package is (unsurprisingly) part of the cite \
bundle of the author's citation-related packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.5svn77682"

RPM_NAME = "texlive-cite-2026.226.5.5svn77682-60.2.noarch.rpm"
RPM_HASH = "014ed3cb915f88b53bf40f3cb783f900e0c916667445cf01c30201ccaec95ae21bef338fba469d404ea035972f761eafeabec929607e528e70de04f45589c71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chapterbib.sty \
tex-cite.sty \
tex-drftcite.sty \
tex-overcite.sty \
texlive-cite"

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
