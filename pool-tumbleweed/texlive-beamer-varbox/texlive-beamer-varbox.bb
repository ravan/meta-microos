SUMMARY = "Provide beamer boxes with variable size corners"
DESCRIPTION = "This package provides beamer boxes with variable size corners. \
It scales the corner arc of a beamer block relative to the \
standard rounded predefined option provided by the beamer \
class. The package depends on beamer and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76296"

RPM_NAME = "texlive-beamer-varbox-2026.226.svn76296-61.2.noarch.rpm"
RPM_HASH = "136b0f0270def7d15b750a16a952b5449e7ca9b0ac59cd4dd2b85beded8484c440e500b47cf0d312850be2840436236339319c199f43d9327d302ea9287ca93f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamer-varbox.sty \
texlive-beamer-varbox"

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
