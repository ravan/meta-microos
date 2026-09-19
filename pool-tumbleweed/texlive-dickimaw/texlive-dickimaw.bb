SUMMARY = "Books and tutorials from the 'Dickimaw LaTeX Series'"
DESCRIPTION = "The package provides some of the books and tutorials that form \
part of the 'Dickimaw LaTeX Series'. Only the A4 PDF of each \
book is detailed here. Other formats, such as HTML or screen \
optimized PDF, are available from the package home page. Books \
included are: 'LaTeX for Complete Novices': an introductory \
guide to LaTeX. 'Using LaTeX to Write a PhD Thesis': a \
follow-on from 'LaTeX for Complete Novices' geared towards \
students who want to use LaTeX to write their PhD thesis. \
'Creating a LaTeX minimal example': describes how to create a \
minimal example, which can be used as a debugging aid when you \
encounter errors in your LaTeX documents."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.svn32925"

RPM_NAME = "texlive-dickimaw-2026.226.svn32925-59.2.noarch.rpm"
RPM_HASH = "29be38ff7af1cd8bca94eda732079d5fe3242b4d1e0417f4a77020ba658a4a2387f0aff47d7184d9a6e57fdc5af245c0b1ab0dae354cb27281dd8538275f2776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dickimaw"

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
