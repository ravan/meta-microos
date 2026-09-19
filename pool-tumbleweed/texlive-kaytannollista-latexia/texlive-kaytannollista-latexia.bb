SUMMARY = "Practical manual for LaTeX (Finnish)"
DESCRIPTION = "'Kaytannollista Latexia' is a practical manual for LaTeX \
written in the Finnish language. The manual covers most of the \
topics that a typical document author needs. So it can be a \
useful guide for beginners as well as a reference manual for \
advanced users."
LICENSE = "LPPL-1.0"

PV = "2026.226.2026svn77555"

RPM_NAME = "texlive-kaytannollista-latexia-2026.226.2026svn77555-63.2.noarch.rpm"
RPM_HASH = "b00430e75f1a6784ca161a5299ad8b59c46897d0d4270a3b59a860858e7603a79ffa720c5c86d3050a88118dc5bc60aadf39e848ddc2ad0e1ffe1f5b08f2d998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kaytannollista-latexia"

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
