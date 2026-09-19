SUMMARY = "Check used commands"
DESCRIPTION = "The package keeps track of whether a command defined in a \
document preamble is actually used somewhere in the document. \
After the package is loaded in the preamble of a document, all \
\\newcommand (and similar command definitions) between that \
point and the beginning of the document will be marked for \
logging. At the end of the document a report of command usage \
will be printed in the TeX log, for example: 'mdash was used on \
line 25'; 'ndash was never used'."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-cmdtrack-2026.226.svn78101-60.2.noarch.rpm"
RPM_HASH = "b79472e4f5e67cfcb2688d3544e2c47ac95e3b064fe763c829e156a3f4126c37f9a02e24062a001180588dad9f4469f295b4d6c453f310db184c5d8771348369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmdtrack.sty \
texlive-cmdtrack"

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
