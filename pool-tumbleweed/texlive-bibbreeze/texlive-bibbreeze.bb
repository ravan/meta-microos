SUMMARY = "A referencing package for automatically reconstructing bibliography data"
DESCRIPTION = "This LaTeX package, called BibBreeze written using LaTeX3, is a \
referencing package that automates bibliography reconstruction, \
eliminating manual effort in reference handling. It reorders \
disorganized fields for bibliography entries, fills in missing \
fields, and produces polished, referencing style-compliant \
bibliographies--optimized for researchers, academics, and \
writers. Currently, the package's referencing style is designed \
for APA (with both numeric and author-year in-text citations) \
with more styles (Harvard, Chicago, AMA, etc.) to come."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-bibbreeze-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "b2940a48d21310fef20b915faff1920b5981ff2c4a7cb1b3c609863dc2cf98c36afa74e90d89033da658e9016b1500b4884900897b1c02a565b22bc6cdd5beb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BibBreeze.bbx \
texlive-bibbreeze"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
