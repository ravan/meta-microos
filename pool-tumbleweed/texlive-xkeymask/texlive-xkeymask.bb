SUMMARY = "An extension of xkeyval with a mask"
DESCRIPTION = "This package is an extension of the xkeyval package by Hendri \
Adriaens that offers macros for hiding certain keys so that \
they are not used in certain places. The idea is that one first \
imports the package in the document preamble, and then creates \
masks use at certain points in the document. The mask can also \
be queried or cleared at some later point."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn69223"

RPM_NAME = "texlive-xkeymask-2026.226.1.0svn69223-59.4.noarch.rpm"
RPM_HASH = "1487555bb02cf0286bcd2fd198715a8c18007fa0ebe3d2bf076f4f05eeb57251da84448001b55855520b3ee3efd79fda9ce782644b85d1bb91588c8ec26898c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xkeymask.sty \
texlive-xkeymask"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
