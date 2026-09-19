SUMMARY = "Lists in TeX's mouth"
DESCRIPTION = "These list-processing macros avoid the reassignments employed \
in the macros shown in Appendix D of the TeXbook: all the \
manipulations take place in what Knuth is pleased to call \
'TeX's mouth'."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn31402"

RPM_NAME = "texlive-lambda-lists-2026.226.svn31402-63.2.noarch.rpm"
RPM_HASH = "83ef1ed5ab84651255cf410e9f610d4ca2470060b5ca3b5f29720da37e87720b5d8c45ff093b9467c52757f2a5ed8e99afb08a6d5904c05d2db6274255edf31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lambda.sty \
texlive-lambda-lists"

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
