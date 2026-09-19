SUMMARY = "Typeset and declare sets of delimiters with convenient size control"
DESCRIPTION = "delimset is a LaTeX2e package to typeset and declare sets of \
delimiters in math mode whose size can be adjusted \
conveniently."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.2svn77682"

RPM_NAME = "texlive-delimset-2026.226.2.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "45541ddb249fb88285217e91c203f1d969e02029f47dea56a9cfc93d9d2aca38e899b908b80790072bf568370bc0d6ae1abb928a2be5fca762e213129bc995d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimset.sty \
texlive-delimset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
