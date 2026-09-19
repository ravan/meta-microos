SUMMARY = "Use AMS Euler fonts for math"
DESCRIPTION = "Provides a setup for using the AMS Euler family of fonts for \
mathematics in LaTeX documents. 'The underlying philosophy of \
Zapf's Euler design was to capture the flavour of mathematics \
as it might be written by a mathematician with excellent \
handwriting.' The euler package is based on Knuth's macros for \
the book 'Concrete Mathematics'. The text fonts for the \
Concrete book are supported by the beton package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn77682"

RPM_NAME = "texlive-euler-2026.226.2.5svn77682-59.2.noarch.rpm"
RPM_HASH = "b6a18eff779904c2c7d079e0ea1da4a13e56428a3da4b5f692fbbcfe79497367f838df96bcfc77429cafbc897a8acc781191cbe2cbe9dc5444d0651242f6c403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euler.sty \
texlive-euler"

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
