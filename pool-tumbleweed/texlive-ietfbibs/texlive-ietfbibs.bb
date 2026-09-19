SUMMARY = "Generate BibTeX entries for various IETF index files"
DESCRIPTION = "The package provides scripts to translate IETF index files to \
BibTeX files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn41332"

RPM_NAME = "texlive-ietfbibs-2026.226.1.0.0svn41332-60.2.noarch.rpm"
RPM_HASH = "560fa0e0026a5a96f2cb218f59bfc7f068c04d4f46c7b252692f1c30f15da6422b5fdb7d8b9d9bf236c68b75b7430fac3a02b4c2d98295c5e60bdde5517ad340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ietfbibs"

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
