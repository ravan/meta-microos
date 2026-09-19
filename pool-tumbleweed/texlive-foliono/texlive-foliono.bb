SUMMARY = "Use folio numbers to replace page numbers"
DESCRIPTION = "This package adds functionality to create several styles of \
folio numbers. Folio numbering preceded the modern page \
numbering convention and was in common use until the 18th \
century. In folio numbering the numbers are placed only on odd \
(right-side) pages and the numbers typically comprise of two \
parts: quire and folio numbers. The intended use for this \
package is to help creating old-style books."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.000svn58877"

RPM_NAME = "texlive-foliono-2026.226.1.000svn58877-60.2.noarch.rpm"
RPM_HASH = "0214c73a0d93708d8bd6fbb3b09dc55afd121f64eeb81296501ac992e428b356b9fd116100c44f1e38c2ad7a0e7842f6cc242b0875e0e0c742dd0b2a8e41148d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foliono.sty \
texlive-foliono"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
