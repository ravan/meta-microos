SUMMARY = "Babel module to support Macedonian Cyrillic"
DESCRIPTION = "The package provides support for Macedonian documents written \
in Cyrillic, in babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn39587"

RPM_NAME = "texlive-babel-macedonian-2026.226.svn39587-60.2.noarch.rpm"
RPM_HASH = "916d16a18bec07c841c14bccb6912622748977cc8aee802187a7a79a6aa88fcafb25f1b5a286741c2a83382a58a824ad90a0f69db273f808c565f53d141424d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macedonian.ldf \
texlive-babel-macedonian"

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
