SUMMARY = "Set space between lines"
DESCRIPTION = "Provides support for setting the spacing between lines in a \
document. Package options include singlespacing, \
onehalfspacing, and doublespacing. Alternatively the spacing \
can be changed as required with the \\singlespacing, \
\\onehalfspacing, and \\doublespacing commands. Other size \
spacings also available."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.7bsvn77682"

RPM_NAME = "texlive-setspace-2026.226.6.7bsvn77682-60.2.noarch.rpm"
RPM_HASH = "f5afa5d7a5492ecfed0faaa34c0511b160b93ebbf6b8dc9c75d7f3832572b9d4379936757d55c5e2d5d0a2ac778e3c5da833ae45424d6bc36bbc4f359c22271f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-setspace.sty \
texlive-setspace"

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
