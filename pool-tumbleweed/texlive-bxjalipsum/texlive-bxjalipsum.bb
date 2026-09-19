SUMMARY = "Dummy text in Japanese"
DESCRIPTION = "This package enables users to print some Japanese text that can \
be used as dummy text. It is a Japanese counterpart of the \
lipsum package. Since there is no well-known nonsense text like \
Lipsum in the Japanese language, the package uses some real \
text in public domain."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn67620"

RPM_NAME = "texlive-bxjalipsum-2026.226.1.0asvn67620-59.2.noarch.rpm"
RPM_HASH = "0ad4718d61fa0eafb069f0baa25c66a76e093c0a6027df14505d425dc6f7a4f38f2e1866de7b8dc5d9ababf71ae6028e9cecdd9b787fa40bc9f57366f5102614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjalipsum.sty \
texlive-bxjalipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-intcalc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
