SUMMARY = "Typesetting German juridical documents"
DESCRIPTION = "A collection of classes for typesetting court sentences, legal \
opinions, books and dissertations for German lawyers. A \
jurabook class is also provided, which may not yet be complete."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn15878"

RPM_NAME = "texlive-juramisc-2026.226.0.0.91svn15878-63.2.noarch.rpm"
RPM_HASH = "4083e0501c0b4607ac6eefaccc7ce5eb4e257d252a8f0f867c062dba13aa6d2f578e735af53ea1baa76e3418c8684463f81f7ed011312adefb7d1d463f826927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jbgoe.clo \
tex-jbstgallen.clo \
tex-jbtrier.clo \
tex-jurabase.sty \
tex-jurabook.cls \
tex-juraovw.cls \
tex-juraurtl.cls \
texlive-juramisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-book.cls \
tex-calc.sty \
tex-color.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-pifont.sty \
tex-ragged2e.sty \
tex-remreset.sty \
tex-scrartcl.cls \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
