SUMMARY = "Vexillogical symbols"
DESCRIPTION = "This package implements symbols used by vexillologists (people \
who study flags) to indicate certain aspects of flags, such as \
where they are used, who uses them, and what they look like. \
The package uses TikZ to draw the symbols, whose heights scale \
with the font size."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn77381"

RPM_NAME = "texlive-vexillology-2026.226.1.0.0svn77381-60.2.noarch.rpm"
RPM_HASH = "750a6cf0913376d768a71f73a05f5b2eb2cbd385efb67bb288bb143875467fed7af4be5317633daae6699f6817d8f8db65db8133e006a6c8cb90713b82d1dee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vexillology.sty \
texlive-vexillology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
