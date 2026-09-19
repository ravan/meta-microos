SUMMARY = "A LaTeX-based replacement for BibTeX"
DESCRIPTION = "Amsrefs is a LaTeX package for bibliographies that provides an \
archival data format similar to the format of BibTeX database \
files, but adapted to make direct processing by LaTeX easier. \
The package can be used either in conjunction with BibTeX or as \
a replacement for BibTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn78101"

RPM_NAME = "texlive-amsrefs-2026.226.2.14svn78101-61.2.noarch.rpm"
RPM_HASH = "791c46c3d5986d05bc218ae32d1f6fdfdaae196c0b38c1f7d10124651f2830c8664af31e173716677349c241d776c8d7d55a577ee95fb348c07f5b27def667d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsbst.sty \
tex-amsrefs.sty \
tex-ifoption.sty \
tex-mathscinet.sty \
tex-pcatcode.sty \
tex-rkeyval.sty \
tex-textcmds.sty \
texlive-amsrefs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-backref.sty \
tex-hyperref.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
