SUMMARY = "University of Washington thesis class"
DESCRIPTION = "The uwthesis package"
LICENSE = "Apache-1.0"

PV = "2026.226.6.13svn15878"

RPM_NAME = "texlive-uwthesis-2026.226.6.13svn15878-60.2.noarch.rpm"
RPM_HASH = "dda7538cf4183584ac787ba768b905eefb0dd44a33c4c774a09093ef2e04a8ac3d95626aafc9b0f4392029b6fe7058b36d314bfd3aa8c4a21750c730bb3f886f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwthesis.cls \
texlive-uwthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
