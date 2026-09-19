SUMMARY = "References to ranges of footnotes"
DESCRIPTION = "The package provides the environments footnoterange and \
footnoterange*. Multiple footnotes inside these environments \
are not referenced as (e.g.) '1 2 3' but as '1-3', i.e., the \
range (from first to last referred footnote at that place) is \
given. If the hyperref package is loaded with enabled \
hyperfootnotes-option, then the references are hyperlinked. \
(References to footnotes in footnoterange* environments are \
never hyperlinked.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-footnoterange-2026.226.1.1csvn77682-60.2.noarch.rpm"
RPM_HASH = "ea2bb78d475a8a609080014c46d314f18511ac973e712d708bb06a6f96b440a0fdca72ef4b140b992bb215bfce82c6c335f6150b032d9afdcf4c9e1b22ba15e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnoterange.sty \
texlive-footnoterange"

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
