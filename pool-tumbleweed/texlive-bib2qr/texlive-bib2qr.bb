SUMMARY = "Cite BibTeX entries with QR codes"
DESCRIPTION = "This package provides functionality to cite BibTeX entries with \
QR codes for easy sharing and referencing. The target of the QR \
code is the entry's digital object identifier (DOI), or URL if \
no DOI exists. It is realised via the LaTeX packages biblatex \
and qrcode."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn71940"

RPM_NAME = "texlive-bib2qr-2026.226.0.0.2svn71940-61.2.noarch.rpm"
RPM_HASH = "8b4fbecc6db60baf7926666f73384c07869f09964797638fd69e35f99b995b221056a6bf9744cd78c732847f729b2fcea717ab47351153db17db187f7b0e7f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bib2qr.sty \
texlive-bib2qr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-ifthen.sty \
tex-qrcode.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
