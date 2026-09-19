SUMMARY = "Adjustments for publications in High Energy Physics"
DESCRIPTION = "This package makes some changes to the reference, citation and \
footnote macros to improve the default behavior of LaTeX for \
High Energy Physics publications."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-reference-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "0691dd64fbb41df2cfaba2e0a3964d142b367eb18c2eb7687b166af8760f1a18b19d6e95c2bd051c8f3e64d9fe28d52353c99fce8a5071ace2d3ceff5ee9438d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-reference.sty \
texlive-hep-reference"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-etoolbox.sty \
tex-footnotebackref.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
