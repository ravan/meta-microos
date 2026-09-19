SUMMARY = "Support for the EMF symbol"
DESCRIPTION = "This package provides LaTeX support for the symbol for the EMF \
in electric circuits and electrodynamics. It provides support \
for multiple symbols but does not provide any fonts; the fonts \
are part of a normal TeX Live installation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn76790"

RPM_NAME = "texlive-emf-2026.226.1svn76790-61.4.noarch.rpm"
RPM_HASH = "f98d888a58c16bcc96eeb0168cef1b3464acd9a7705bea80773803f8ef511bd2d58cd2a4c78ca9c29ff66bdff4436919bfb557bcae2e5a3ee12cbf4203445cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emf.sty \
texlive-emf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
