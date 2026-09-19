SUMMARY = "LaTeX support for wnri fonts"
DESCRIPTION = "LaTeX support for the wnri fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0bsvn22338"

RPM_NAME = "texlive-wnri-latex-2026.226.1.0bsvn22338-60.2.noarch.rpm"
RPM_HASH = "25825a048fd166b259d89021c892d755b0d8ffab81b4b1aa6a180d4d20e666388a309ba77734e62447351dd26c64bcd30b79fd6aa7a9e1bf8b133f4f0a696e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1wnr.fd \
tex-ot1wnss.fd \
tex-ot1wntt.fd \
tex-wnri.def \
tex-wnri.sty \
texlive-wnri-latex"

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
