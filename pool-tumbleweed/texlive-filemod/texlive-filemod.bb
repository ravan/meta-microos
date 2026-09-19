SUMMARY = "Provide file modification times, and compare them"
DESCRIPTION = "The package provides macros to read and compare the \
modification dates of files. The files may be .tex files, \
images or other files (as long as they can be found by LaTeX). \
It uses the \\pdffilemoddate primitive of pdfLaTeX to find the \
file modification date as PDF date string, parses the string \
and returns the value to the user. The package will also work \
for DVI output with recent versions of the LaTeX compiler which \
uses pdfLaTeX in DVI mode. The functionality is provided by \
purely expandable macros or by faster but non-expandable ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-filemod-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "0bcba21cd3642fd752e7aa7aec393bffa836d5d0703e4939cdb940913315de26e6fe4f2a31dd7a3a7d11d3a5f1ba4060ceecb6025743ff6332b7a1182f949b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filemod-expmin.sty \
tex-filemod-expmin.tex \
tex-filemod.sty \
tex-filemod.tex \
texlive-filemod"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
