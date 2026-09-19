SUMMARY = "Ensure minimal spacing of table cells"
DESCRIPTION = "It is well known that high or deep cells tend to touch the \
\\hlines of a tabular. This package provides a modifier S acting \
on usual column types so that to ensure a minimal distance that \
can be controlled through two parameters \\cellspacetoplimit and \
\\cellspacebottomlimit. The approach employed by this package is \
noticeably simpler than that of tabls, which considers the \
dimensions of each entire row; whereas you can ask the \
cellspace only to look at the cells of potentially difficult \
columns. The package depends on ifthen, array, calc, and \
xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.1asvn77682"

RPM_NAME = "texlive-cellspace-2026.226.1.9.1asvn77682-59.2.noarch.rpm"
RPM_HASH = "ae822ac2f4f6a88acf139a30cdc88773afb755ada7397f01dce934ba543daef8c95df9a084af3b91248b67720bdc4b3cb0f1ebf7b4ce1d3ea9f4e908001677c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cellspace.sty \
texlive-cellspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
