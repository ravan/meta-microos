SUMMARY = "Babel contributed support for Dutch"
DESCRIPTION = "The package provides a language definition, file for use with \
babel, which establishes Dutch conventions in a document (or a \
subset of the conventions, if Dutch is not the main language of \
the document)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8lsvn77682"

RPM_NAME = "texlive-babel-dutch-2026.226.3.8lsvn77682-60.2.noarch.rpm"
RPM_HASH = "6b13e82ae381143ea6fca4deacaa0670a6541d061f0d13fec25c7afa2df54743277eb1752667986d6ce2feff65aa63eaae8af569c2d301619ddf242fd84543f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afrikaans.ldf \
tex-dutch.ldf \
texlive-babel-dutch"

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
