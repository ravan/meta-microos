SUMMARY = "Index entries by key lookup"
DESCRIPTION = "The package provides functionality for producing an index \
without directly entering index entries into the text using the \
\\index command, but instead by looking up short keys and \
printing a predefined string in the main text and adding a \
corresponding index entry. The standard use case is the \
production of an index of names."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn50828"

RPM_NAME = "texlive-keyindex-2026.226.1.0svn50828-63.2.noarch.rpm"
RPM_HASH = "c241ca02812f283341145e20a5ed05d518fb157c44098b9a41d0181067de208b5b4436955687ed053e82fe5caac85e398879e615af6d7ad00ae5cf917c010e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyindex.sty \
texlive-keyindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
