SUMMARY = "Print a block of code, with unique index number"
DESCRIPTION = "The package has been created for the convenience of the report \
writer; it provides the means to number, and label, code-block \
snippets in your document. In this way, you can (unambiguously) \
refer to each snippet elsewhere in your document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn33109"

RPM_NAME = "texlive-numberedblock-2026.226.1.10svn33109-61.2.noarch.rpm"
RPM_HASH = "bafa71c68223a5f5a158a9a51c22b10168a72a573597a1a49f573b6ddee6edc8904e202fd58431740db87cf2994c7457bf78990e9404792e429a30e20a3a52cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numberedblock.sty \
texlive-numberedblock"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
tex-verbatimbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
