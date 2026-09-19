SUMMARY = "Display various elements of a document's layout"
DESCRIPTION = "Display information about a document, including: text \
positioning on a page; disposition of floats; layout of \
paragraphs, lists, footnotes, table of contents, and sectional \
headings; font boxes. Facilities are provided for a document \
designer to experiment with the layout parameters."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6dsvn77682"

RPM_NAME = "texlive-layouts-2026.226.2.6dsvn77682-61.2.noarch.rpm"
RPM_HASH = "e3c47287bdcd6b7c9667636a635cada6f64ba69f67003e2be34e0a1d52793923700c6db4e1304abd7c7c03576b9bf4404620b6bda16b99ba6ac498dc2b9371b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-layouts.sty \
texlive-layouts"

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
