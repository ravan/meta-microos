SUMMARY = "Create Handouts with notes from your LaTeX beamer presentation"
DESCRIPTION = "This package provides pgfpages layouts to place notes next to \
the scaled slides."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-handoutwithnotes-2026.226.1.3svn76924-60.4.noarch.rpm"
RPM_HASH = "9f8e0a9494790adda9b54fbfc0c4470f70054a9239d0455e36619cd5bce506beb870b205622efec32eda0268bdd7ea675b33c4d46704880a878e78eebe041389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handoutWithNotes.sty \
texlive-handoutwithnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-pgfpages.sty \
tex-translator.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
