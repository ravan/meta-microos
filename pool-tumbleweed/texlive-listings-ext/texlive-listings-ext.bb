SUMMARY = "Automated input of source"
DESCRIPTION = "The package provides a means of marking a source, so that \
samples of it may be included in a document (by means of the \
listings package) in a stable fashion, regardless of any change \
to the source. The markup in the source text defines tags for \
blocks of source. These tags are processed by a shell script to \
make a steering file that is used by the package when LaTeX is \
being run.y"
LICENSE = "LPPL-1.0"

PV = "2026.226.67svn29349"

RPM_NAME = "texlive-listings-ext-2026.226.67svn29349-61.2.noarch.rpm"
RPM_HASH = "4ba16620a7e0249664c12241088888724b2d96571f1e944399843ab2484f686fa2f998dcd03b42e7a46b91c807124099e1939448d6a02fb975b5d70a6ae06ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listings-ext.sty \
texlive-listings-ext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings-ext-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
