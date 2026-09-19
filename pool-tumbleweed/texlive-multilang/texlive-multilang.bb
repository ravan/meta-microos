SUMMARY = "A LaTeX package for maintaining multiple translations of a document"
DESCRIPTION = "Maintaining a LaTeX document with translations for multiple \
languages can be cumbersome and error-prone. This package \
provides a set of macros for defining macros and environments \
as wrappers around existing macros and environments. These \
wrappers allow one to clearly specify multiple translations for \
the arguments to the wrapped macros and environments while only \
the translation of the document's language is actually shown. \
Choosing a translation then is as simple as choosing the \
document's language via babel or polyglossia."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9bsvn77682"

RPM_NAME = "texlive-multilang-2026.226.0.0.9bsvn77682-61.2.noarch.rpm"
RPM_HASH = "c7b13ced2856557f94ecf6787afbf64aec12758122d7a7516b477647396398d1b681675edc2c526a22785f96f30bbbe263c497793637d60681905e5f0c98456b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multilang-sect.sty \
tex-multilang-tags.sty \
tex-multilang.sty \
texlive-multilang"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
