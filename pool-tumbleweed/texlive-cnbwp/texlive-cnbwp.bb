SUMMARY = "Typeset working papers of the Czech National Bank"
DESCRIPTION = "The package supports proper formatting of Working Papers of the \
Czech National Bank (WP CNB). The package was developed for CNB \
but it is also intended for authors from outside CNB."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024.02svn69910"

RPM_NAME = "texlive-cnbwp-2026.226.2024.02svn69910-60.2.noarch.rpm"
RPM_HASH = "7abf74ac03b8fa7cea30889e1504c98f12f6c5698120774aa489d53b7a452ae43b6fe1f2a83345c2bd97068afeab27f7a9a385bdc7c026771d5f35ad44fb1c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cnbwp-manual.sty \
tex-cnbwp.cls \
tex-cnbwpsizes.clo \
texlive-cnbwp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-color.sty \
tex-dcolumn.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-makeidx.sty \
tex-mathptmx.sty \
tex-moreverb.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-polyglossia.sty \
tex-rotating.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xevlna.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
