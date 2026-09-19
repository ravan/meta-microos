SUMMARY = "Hanging paragraphs"
DESCRIPTION = "The hanging package facilitates the typesetting of hanging \
paragraphs. The package also enables typesetting with hanging \
punctuation, by making punctuation characters active. This \
facility is best suppressed (it can interfere with other \
packages) -- there are package options for suppressing each \
individual punctuation character. 'Real' attempts at hanging \
punctuation should nowadays use the microtype package, which \
takes advantage of the support offered in recent versions of \
pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn77682"

RPM_NAME = "texlive-hanging-2026.226.1.2bsvn77682-60.4.noarch.rpm"
RPM_HASH = "4b436a5292732883c101a3c4cee82ddf6f8f2b84ae3f4baf66e81e237bd608af50d1a178112349d90d709fa7cefe589e4616b47dce9266b9ecd0ff45f3aae7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanging.sty \
texlive-hanging"

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
