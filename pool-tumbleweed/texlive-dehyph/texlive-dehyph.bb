SUMMARY = "German hyphenation patterns for traditional orthography"
DESCRIPTION = "The package provides older hyphenation patterns for the German \
language. Please note that by default only pdfLaTeX uses these \
patterns (mainly for backwards compatibility). The older \
packages ghyphen and gnhyph are now bundled together with \
dehyph, and are no longer be updated. Both XeLaTeX and LuaLaTeX \
use the current German hyphenation patterns taken from \
Hyphenation patterns in UTF-8, and using the Experimental \
hyphenation patterns for the German language package it is \
possible to make pdfLaTeX use the new German patterns as well."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48599"

RPM_NAME = "texlive-dehyph-2026.226.svn48599-59.2.noarch.rpm"
RPM_HASH = "5231592b6557a55823e3c44a3329d0805b4f7670fef7a5ec40c09227ba582f1b960826e5f5288054da8d71687e4ffc5f9e8305047109e62f5a9127a5eb20fc90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dehyphn.tex \
tex-dehypht.tex \
tex-dehyphtex.tex \
texlive-dehyph"

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
