SUMMARY = "'Arts'-style bibliographical information"
DESCRIPTION = "BibArts is a LaTeX package to assist in making bibliographical \
features common in the arts and the humanities (history, \
political science, philosophy, etc.). bibarts.sty provides \
commands for quotations, abbreviations, and especially for a \
formatted citation of literature, journals (periodicals), \
edited sources, and archive sources. In difference to earlier \
versions, BibArts 2.x helps to use slanted fonts (italics) and \
is able to set ibidem automatically in footnotes. It will also \
copy all citation information, abbreviations, and register key \
words into lists for an automatically generated appendix. These \
lists may refer to page and footnote numbers. BibArts has \
nothing to do with BibTeX. The lists are created by bibsort \
(see below). BibArts requires the program bibsort, for which \
the sources and a Windows executable are provided. This program \
creates the bibliography without using MakeIndex or BibTeX. Its \
source is not written with any specific operating system in \
mind. A summary of contents is in English; the full \
documentation is in German."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.6svn74384"

RPM_NAME = "texlive-bibarts-2026.226.2.6svn74384-61.2.noarch.rpm"
RPM_HASH = "e1077d053a2acffccee8f7ce60481a91580f5c2d0f4fe922c28ae64129e66c6b889f1a05cefdf1829da9a7636d3ca8118fbfc72e834d553f67e84e3d5076db9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibarts.sty \
texlive-bibarts"

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
