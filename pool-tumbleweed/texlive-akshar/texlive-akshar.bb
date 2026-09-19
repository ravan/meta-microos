SUMMARY = "Support for syllables in the Devanagari script"
DESCRIPTION = "This LaTeX3 package provides macros and interfaces to work with \
Devanagari characters and syllables in a more correct way."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-akshar-2026.226.0.0.2svn76924-61.2.noarch.rpm"
RPM_HASH = "eb444f0debc20f0481c1344df0960481592fce835b3d68ceac94cbe175c1ef88a7fc8b10723a782f948f9845f7b4c4265ec9a3f1c7360813ab10434791844286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-akshar.sty \
texlive-akshar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
