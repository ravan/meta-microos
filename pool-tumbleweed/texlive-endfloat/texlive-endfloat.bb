SUMMARY = "Move floats to the end, leaving markers where they belong"
DESCRIPTION = "Place all floats on pages by themselves at the end of the \
document, optionally leaving markers like '[Figure 3 about \
here]' in the text near to where the figure (or table) would \
normally have occurred. Float types figure and table are \
recognised by the package, unmodified. Since several packages \
define other types of float, it is possible to register these \
float types with endfloat."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-endfloat-2026.226.2.7svn77682-61.4.noarch.rpm"
RPM_HASH = "fd566d2b0759265e9358740380cdf655c526c3fb20449e80fe0919b560fea5007e04f996f53030791e7308c4ab5389dca66d64b3a893001f77fb47e33375d545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endfloat.sty \
texlive-endfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
