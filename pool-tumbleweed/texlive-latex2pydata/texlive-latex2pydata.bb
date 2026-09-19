SUMMARY = "Write data to file in Python literal format"
DESCRIPTION = "This package writes data to file using Python literal syntax. \
The data may be loaded safely in Python using the \
ast.literal_eval() function or the latex2pydata Python package. \
The data can also be hashed within LaTeX (mdfivesum) so that it \
is possible to check for the existence of external cached \
content generated with the data."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn78166"

RPM_NAME = "texlive-latex2pydata-2026.226.0.0.7.0svn78166-61.2.noarch.rpm"
RPM_HASH = "05e0d51e8a8a5509f5f828fde428adcee0572ac9ae612f7dd23b6c5cd1e96ad4db6a96c3f61366e688b34535ab4934f8174179cd76a5235ab2052b03a47b807c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex2pydata.sty \
texlive-latex2pydata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fvextra.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
