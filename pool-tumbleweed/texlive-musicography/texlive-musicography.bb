SUMMARY = "Accessing symbols for music writing with pdfLaTeX"
DESCRIPTION = "This package makes available the most commonly used symbols in \
writing about music in a way that can be used with pdfLaTeX and \
looks consistent and attractive. It includes accidentals, \
meters, and notes of different rhythmic values. The package \
builds on the approach used in the harmony package, where the \
symbols are taken from the MusiXTeX fonts. But it provides a \
larger range of symbols and a more flexible, user-friendly \
interface written using xparse and stackengine."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-musicography-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "a656ac02e59a2a6f90fb655e5bf6a2e1894cff5fb0b8a88f073f6ec44522e5d60cc0e9505ba71e111d106029a25419db20fc5c35dd2263b1d10b55c70bbc923c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musicography.sty \
texlive-musicography"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-setspace.sty \
tex-stackengine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
