SUMMARY = "Calculate the age of something, in years"
DESCRIPTION = "The package calculates the age of someone or something in \
years. Internally it uses the datenumber package to calculate \
the age in days; conversion from days to years is then \
performed, taking care of leap years and such odd things."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.90svn27725"

RPM_NAME = "texlive-calcage-2026.226.0.0.90svn27725-59.2.noarch.rpm"
RPM_HASH = "a00c30c0028f5d4b47fa91f48965f2e697ac011a0ba806d2cf0366ca0de5cb57e41df781661d9a8676a7c373fb4ed6ca02573b4c29edc02dd003105b4e0fa513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calcage.sty \
texlive-calcage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fnumprint.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
