SUMMARY = "Support for designing posters on large paper"
DESCRIPTION = "Provides fonts in sizes of 12pt up to 107pt and also makes sure \
that in math formulas the symbols appear in the right size. Can \
also create a PostScript header file for dvips which ensures \
that the poster will be printed in the right size. Supported \
sizes are DIN A0, DIN A1, DIN A2 and DIN A3."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.22bsvn54071"

RPM_NAME = "texlive-a0poster-2026.226.1.22bsvn54071-61.2.noarch.rpm"
RPM_HASH = "9e9cd2a7b36e752cf3b981f8e9c5e547f063b46dee156c6e808c0d521a53b6768f8e634e4290aecfa1ebdfc1b304c17df086fec507f4557150c4002226f84ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a0poster.cls \
tex-a0size.sty \
texlive-a0poster"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
