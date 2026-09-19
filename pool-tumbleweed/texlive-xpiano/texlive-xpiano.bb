SUMMARY = "An extension of the piano package"
DESCRIPTION = "This package provides macros for typesetting virtual keyboards \
limited to two octaves for showing notes represented by a \
colored circle. Optionally, the number used for pitch analysis \
can be shown. It is an extension of piano.sty by Emile \
Daneault, written in expl3 in answer to a couple of questions \
on TeX.StackExchange: \
https://tex.stackexchange.com/questions/162184/ \
https://tex.stackexchange.com/questions/246276/. It features \
extended syntax and several options, like setting the color, \
adding numbers for pitch analysis, one or two octaves, and \
others."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-xpiano-2026.226.1.0svn77682-59.4.noarch.rpm"
RPM_HASH = "0d0f5bc85d675b5f1386ddcf97b4800d12bbf17e73515f08d01432483a9b98dcac7a8ab197092cbd6d0b36334f5f49b4e2cbf010a157e6a3992f319efd1f9910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpiano.sty \
texlive-xpiano"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
