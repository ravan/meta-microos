SUMMARY = "Continuation headings and legends for floats"
DESCRIPTION = "A package providing commands for 'continuation captions', \
unnumbered captions, and also a non-specific legend heading for \
any environment. Methods are also provided to define captions \
for use outside float (e.g., figure and table) environments, \
and to define new float environments and Lists of Floats. Tools \
are provided for specifying your own captioning styles."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2csvn77682"

RPM_NAME = "texlive-ccaption-2026.226.3.2csvn77682-59.2.noarch.rpm"
RPM_HASH = "a3bbc2d1da2dd2fe7f12f8a0b21cb97630c85fdc43e7b3135af8bbd84da253e57ec36a7fae2a556297cca8c0f151f79186b02d2f34863e40689bcf0c39104bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccaption.sty \
texlive-ccaption"

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
