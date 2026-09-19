SUMMARY = "Hyperlinks for a wide range of URIs"
DESCRIPTION = "The package provides automatic hyperlinks for URIs of type \
arXiv, ASIN, DOI, HDL, NBN, OCLC, OID, PubMed, TINY, TINY with \
preview, and WebCite and provides commands \\citeurl, \\mailto, \
\\ukoeln, and \\uref."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn77682"

RPM_NAME = "texlive-uri-2026.226.2.0bsvn77682-60.2.noarch.rpm"
RPM_HASH = "6bf306f1b6cc27ce9862af1d73a86facd854b3e83d7bda63572b08d4ac5287ce6cfdfb8f9ccc8bca44f88ea83750f9dd438fc2db7d2461960c33d5c5b81db06d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uri.sty \
texlive-uri"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
