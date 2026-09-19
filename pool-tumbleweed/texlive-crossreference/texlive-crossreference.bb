SUMMARY = "Crossreferences within documents"
DESCRIPTION = "The package defines cross-references (essentially 'grand' label \
references), which may be listed in a table of \
cross-references."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-crossreference-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "5e819182a4907332b4054970d40c627d7c5b5e73bccf12c0c9fd7ce64e556e44638c0cf45a8c255da5322712672d13b8641fe9960cd800f0feac1b5ee5fe90c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossreference.sty \
texlive-crossreference"

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
