SUMMARY = "Class for articles for submission to Elsevier journals"
DESCRIPTION = "This class for typesetting journal articles is accepted for \
submitted articles both in Elsevier's electronic submission \
system and elsewhere. Please note that this webpage is meant \
for uploading updates to the elsarticle software itself, not \
for submitting articles using it ."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5svn77318"

RPM_NAME = "texlive-elsarticle-2026.226.3.5svn77318-61.4.noarch.rpm"
RPM_HASH = "fdbf539fdcab217ab17b946c98ad01eb389d25449c5d2147a9ed715b35761f0ce2ea6b426a8b96f28490937e913497a74fba7597dae832d926ae3751bd16f8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elsarticle.cls \
texlive-elsarticle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-endfloat.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fleqn.clo \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-natbib.sty \
tex-times.sty \
tex-txfonts.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
