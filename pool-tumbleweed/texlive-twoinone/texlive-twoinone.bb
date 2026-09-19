SUMMARY = "Print two pages on a single page"
DESCRIPTION = "The package is for printing two pages on a single (landscape) \
A4 page. Page numbers appear on the included pages, and not on \
the landscape 'container' page."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17024"

RPM_NAME = "texlive-twoinone-2026.226.svn17024-59.2.noarch.rpm"
RPM_HASH = "7e56597b57ac12fd19b0f68b2f58dd3639ac5dd74a15edc49ab9b66e730f96989ae61fedb019de563424300fb1f9b44cc947073e79ca0b7912aa68957654f4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2in1.sty \
texlive-twoinone"

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
