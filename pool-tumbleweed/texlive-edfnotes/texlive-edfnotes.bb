SUMMARY = "Critical annotations to footnotes with ednotes"
DESCRIPTION = "The package modifies the annotation commands and label-test \
mechanism of the ednotes package so that critical notes appear \
on the pages and in the order that one would expect."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-2026.226.0.0.6bsvn21540-61.4.noarch.rpm"
RPM_HASH = "a48f4dd6f2096ba6b532e1fcb815913119e266a5a10fba45991e4ccf5c22843a019dfa1a2dd08bd416fe3de91877a6ddafa82a1ff519f58c7b5146a88f27c5cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edfnotes.sty \
texlive-edfnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fnlineno.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
