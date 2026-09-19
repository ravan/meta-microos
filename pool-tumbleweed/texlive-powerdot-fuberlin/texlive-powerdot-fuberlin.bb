SUMMARY = "Powerdot, using the style of FU Berlin"
DESCRIPTION = "The bundle provides a powerdot-derived class and a package for \
use with powerdot to provide the corporate design of the Free \
University in Berlin. Users may use the class itself \
(FUpowerdot) or use the package in the usual way with \
\\style=BerlinFU as a class option. Examples of using both the \
class and the package are provided; the PDF is visually \
identical, so the catalogue only lists one; the sources of the \
examples do of course differ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02asvn52922"

RPM_NAME = "texlive-powerdot-fuberlin-2026.226.0.0.02asvn52922-59.2.noarch.rpm"
RPM_HASH = "8edbc29657e7b35b0ab06c8761549df0b1221eb989a06d006ef4ff6065a0b254ce34b7bf241f8819e77949d86086f6c33429197284d56c5947b39eaded3f2800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FUpowerdot.cls \
tex-powerdot-BerlinFU.sty \
texlive-powerdot-fuberlin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-breakurl.sty \
tex-calc.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-pifont.sty \
tex-powerdot.cls \
tex-ragged2e.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
