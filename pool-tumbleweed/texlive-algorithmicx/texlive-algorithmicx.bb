SUMMARY = "The algorithmic style you always wanted"
DESCRIPTION = "Algorithmicx provides a flexible, yet easy to use, way for \
inserting good looking pseudocode or source code in your \
papers. It has built in support for Pseudocode, Pascal and C, \
and offers powerful means to create definitions for any \
programming language. The user can adapt a Pseudocode style to \
his native language."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-algorithmicx-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "f39c9ddf9b68db6d5960a8a86a918599ad53c37dc50a295c632d38993a767f5ba0773814e4000f71a525ca0107826d5d116bf1f1a1fb755b8500990d97f022df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algc.sty \
tex-algcompatible.sty \
tex-algmatlab.sty \
tex-algorithmicx.sty \
tex-algpascal.sty \
tex-algpseudocode.sty \
texlive-algorithmicx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
