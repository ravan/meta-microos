SUMMARY = "Print font tables from a LaTeX document"
DESCRIPTION = "This is a package version of nfssfont.tex (part of the LaTeX \
distribution); it enables you to print a table of the \
characters of a font and/or some text (for demonstration or \
testing purposes), from within a document. (Packages such as \
testfont and nfssfont.tex provide these facilities, but they \
run as interactive programs: the user is expected to type \
details of what is needed.) Note that the package mftinc also \
has a \\fonttable function; the documentation explains how avoid \
a clash with that package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6dsvn77682"

RPM_NAME = "texlive-fonttable-2026.226.1.6dsvn77682-60.2.noarch.rpm"
RPM_HASH = "27a1c40556c27459e114edbf91c4308fbe30f24669424b9843363d83d37353b45db3b479a2f10a98f263a6bc2f1bf1f8013b46d4a45d0ae817fe746259748c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fonttable.sty \
texlive-fonttable"

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
