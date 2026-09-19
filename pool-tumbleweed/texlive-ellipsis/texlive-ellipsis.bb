SUMMARY = "Fix uneven spacing around ellipses in LaTeX text mode"
DESCRIPTION = "This is a simple package that fixes a problem in the way LaTeX \
handles ellipses: it always puts a tiny bit more space after \
\\dots in text mode than before it, which results in the \
ellipsis being off-center when used between two words."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-ellipsis-2026.226.1.8svn77682-61.4.noarch.rpm"
RPM_HASH = "f4270148a3b36a18aca0b4a88cd297cfa769fd35ebbb8b913b81b6cafb887617a366ab86a27b430b9f8b4a83b28307411c296314f5365c6b8d432879daf736b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipsis.sty \
texlive-ellipsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
