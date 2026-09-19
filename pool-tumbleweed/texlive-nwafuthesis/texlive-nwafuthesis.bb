SUMMARY = "A thesis template package for Northwest A&F University, China"
DESCRIPTION = "This template supports doctoral and master dissertations and \
undergraduate theses in Chinese. With the help of modern LaTeX3 \
technology, nwafuthesis aims to create a simple interface, a \
normative format, as well as a hackable class for the users. At \
present, nwafuthesis only supports XeTeX and LuaTeX engines. \
nwafuthesis only allows UTF-8 encoding. nwafuthesis is based on \
the fduthesis template."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.25svn76924"

RPM_NAME = "texlive-nwafuthesis-2026.226.1.25svn76924-61.2.noarch.rpm"
RPM_HASH = "6d01e56b521e570dc00637580339cc38156e5737c7367bca8fb00f826b1eaec16c90ab7af80fa177ee560e99fbee6b40f34063d880a23a971940eac471cc7b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nwafuthesis.cls \
texlive-nwafuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-expl3.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-pifont.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
