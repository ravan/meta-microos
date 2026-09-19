SUMMARY = "A font for KIX codes"
DESCRIPTION = "The KIX code is a barcode-like format used by the Dutch PTT to \
encode country codes, zip codes and street numbers in a \
machine-readable format. If printed below the address line on \
bulk mailings, a discount can be obtained. The font is \
distributed in Metafont format, and covers the numbers and \
upper-case letters."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18488"

RPM_NAME = "texlive-kixfont-2026.226.svn18488-63.2.noarch.rpm"
RPM_HASH = "e94d3924c9919d3fd1d2852dc88c12e76e9a5a3adcd15dc4ee42d99b6cc5780c7bb31c0574c2e82fc8831bb16165be7ce4a9b5cc77331fe5cc050978d85e0dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kix.tfm \
texlive-kixfont"

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
