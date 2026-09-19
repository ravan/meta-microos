SUMMARY = "A flexible interface for setting font sizes"
DESCRIPTION = "This package provides an interface for selecting (arbitrary) \
font sizes and associated values."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0.0svn77912"

RPM_NAME = "texlive-fontscale-2026.226.5.0.0svn77912-60.2.noarch.rpm"
RPM_HASH = "1299b5179ccb995eb57f569cbe9cf626732f4dcb55c24dec38978f062814bf8de9730ed1156bc2bc3c27b1a59ff99c0c28c59b6561e9c09e278df4d73a2d7f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontscale.sty \
texlive-fontscale"

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
