SUMMARY = "Estonian introduction to LaTeX"
DESCRIPTION = "This is the Estonian translation of Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.5.05svn39323"

RPM_NAME = "texlive-lshort-estonian-2026.226.5.05svn39323-61.2.noarch.rpm"
RPM_HASH = "1331955a5e853be5a8e324798150b59534db4303cd476d981c7b5b6fc7d6c1a65e99662552c3a84e3195f3962aa718fbfaa992beb90c99ec2af0763ee6a90bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-estonian"

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
