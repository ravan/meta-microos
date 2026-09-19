SUMMARY = "A LaTeX template for authors of the Hindawi journals"
DESCRIPTION = "This package contains a LaTeX template for authors of the \
Hindawi journals. Authors can use this template for formatting \
their research articles for submissions. The package has been \
created and is maintained by the Typeset team."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn57757"

RPM_NAME = "texlive-hindawi-latex-template-2026.226.1.0svn57757-60.4.noarch.rpm"
RPM_HASH = "69523cbb6a326ba9e4e7a815524e6721f621a60b5918608dc28515e66e4c2c5dd02457b061948d2399fecf1093fa7400d84e4264f2aec05cfcde4d078f1b7040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindawi-latex-template"

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
