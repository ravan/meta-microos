SUMMARY = "User documentation for AMS document classes"
DESCRIPTION = "This collection comprises a set of four manuals, or Author \
Handbooks, each documenting the use of a class of publications \
based on one of the AMS document classes amsart, amsbook, \
amsproc and one 'hybrid', as well as a guide to the generation \
of the four manuals from a coordinated set of LaTeX source \
files. The Handbooks comprise the user documentation for the \
pertinent document classes. As the source for the Handbooks \
consists of a large number of files, and the intended output is \
multiple different documents, the principles underlying this \
collection can be used as a model for similar projects. The \
manual 'Compiling the AMS Author Handbooks' provides \
information about the structure of and interaction between the \
various components."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46110"

RPM_NAME = "texlive-amscls-doc-2026.226.svn46110-61.2.noarch.rpm"
RPM_HASH = "eda853d3cd6aefc810ea8c8f3bb78133aaf141b86f6573ea251879c115019efbc925d31910956d9a0cf2991be7ee93f610c300f8a5654275cec27615951d732c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amscls-doc"

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
