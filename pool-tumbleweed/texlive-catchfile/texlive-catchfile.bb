SUMMARY = "Catch an external file into a macro"
DESCRIPTION = "This package catches the contents of a file and puts it in a \
macro. It requires e-TeX. Both LaTeX and plain TeX are \
supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-catchfile-2026.226.1.8svn77682-59.2.noarch.rpm"
RPM_HASH = "7916eb673cba4844ad650b7b1aa8cc92d943a987c52cf5f122a3abfb2a80598e7c9b023ed80b19812b8a285bd8958fc2aff5a09d048e04b0ee074392e9b2ebcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catchfile.sty \
texlive-catchfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etexcmds.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
