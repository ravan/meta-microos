SUMMARY = "Create thumb indexes"
DESCRIPTION = "The package puts running, customizable thumb marks in the outer \
margin, moving downward as the chapter number (or whatever \
shall be marked by the thumb marks) increases. Additionally an \
overview page/table of thumb marks can be added automatically, \
which gives the names of the thumbed objects, the page where \
the object/thumb mark first appears, and the thumb mark itself \
at its correct position. The thumb marks are useful for large \
documents (such as reference guides, anthologies, etc.), where \
a quick and easy way to find (for example) a chapter is needed."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1dsvn77682"

RPM_NAME = "texlive-thumbs-2026.227.1.1dsvn77682-62.2.noarch.rpm"
RPM_HASH = "18e96c22c32bba6aedff72cada76e83a513e2922c0e80ca5997cccb637f0f3e6e28fc297deabfec5342ae2b5622f34b2a510161872994115d885919e56ebe7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumbs.sty \
texlive-thumbs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-pagecolor.sty \
tex-picture.sty \
tex-rerunfilecheck.sty \
tex-undolabl.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
