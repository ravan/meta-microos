SUMMARY = "Change the resetting of counters"
DESCRIPTION = "Defines commands \\counterwithin (which sets up a counter to be \
reset when another is incremented) and \\counterwithout (which \
unsets such a relationship)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-chngcntr-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "9f4721523760de70935d4e6c2634e8128f29be2c1c289a2f18f953eb4813db8084f16cc7b5227b660adab3c49056634b4f91e6cf01734d2c1165c01031be0241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chngcntr.sty \
texlive-chngcntr"

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
