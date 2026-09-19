SUMMARY = "Creates a list of all labels used throughout a document"
DESCRIPTION = "The package aims to help a LaTeX author to keep track of all \
defined labels by typesetting a complete list of labels \
wherever the author requests it. (Of course, the user may need \
to have additional LaTeX runs to get the references right. ) \
This package is based on an answer David Carlisle gave on \
TeX/Stackexchange in the thread 'List of all labels with \
hyperlinks'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn77682"

RPM_NAME = "texlive-listlbls-2026.226.1.04svn77682-61.2.noarch.rpm"
RPM_HASH = "15dec7c7ebd9bc863145a9784460b753d77e9c40519aaf935c919abb2068053a1c9057cbd25ca918ea2d43552e831dcfaaf622a633d05362f408df4f293516d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listlbls.sty \
texlive-listlbls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
