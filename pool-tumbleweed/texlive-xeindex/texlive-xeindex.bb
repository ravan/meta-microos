SUMMARY = "Automatic index generation for XeLaTeX"
DESCRIPTION = "The package is based on XeSearch, and will automatically index \
words or phrases in an XeLaTeX document. Words are declared in \
a list, and every occurrence then creates an index entry whose \
content can be fully specified beforehand."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-xeindex-2026.226.0.0.3svn77682-59.4.noarch.rpm"
RPM_HASH = "452681558cbc89fe4377f3ea3622eecf56df49416bc68ecbd1bbdabf3347e9896b5bfcea4968ce12d83cef19eed80629a91b7bb9f730bdb7fcf7ededeed4f603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xeindex.sty \
texlive-xeindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
tex-xesearch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
