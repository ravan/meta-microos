SUMMARY = "UK format dates, with weekday"
DESCRIPTION = "The package is used to change the format of \\today's date, \
including the weekday, e.g., 'Saturday, 26 June 2008', the 'UK \
format', which is preferred in many parts of the world, as \
distinct from that which is used in \\maketitle of the article \
class, 'June 26, 2008', the 'US format'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn15878"

RPM_NAME = "texlive-eukdate-2026.226.1.04svn15878-59.2.noarch.rpm"
RPM_HASH = "34a488b433ba5184eb34405d64aa3a01d0e989cc01127d6b178f8288b62842ae28ccb97bc3d2864dc41a4cfc0f117b423fbfeae30c0a89fe3e9565f756c017ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eukdate.sty \
texlive-eukdate"

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
