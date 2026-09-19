SUMMARY = "Macros for using characters from Unicode's Private Use Area"
DESCRIPTION = "While Unicode supports the vast majority of use cases, there \
are certain specialized niches which require characters and \
glyphs not (yet) represented in the standard. Thus the Private \
Use Area (PUA) at code points E000-F8FF, which enables third \
parties to define arbitrary character sets. This package allows \
configuring a number of macros for using various PUA character \
sets in LaTeX (AGL, CYFI, MUFI, SIL, TITUS, UCSUR, UNZ), to \
enable transcription and display of medieval and other \
documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66225"

RPM_NAME = "texlive-unicode-alphabets-2026.226.svn66225-60.2.noarch.rpm"
RPM_HASH = "308384e8d6d1a9a832cfbff5f535fcc7be239a681196356c058d09334e794adfdd5fa46e44652ee2c2dba635cadedb6ccab9ef51a8baee13174c4de9cf570a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-alphabets.sty \
texlive-unicode-alphabets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csvsimple.sty \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-stringstrings.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
