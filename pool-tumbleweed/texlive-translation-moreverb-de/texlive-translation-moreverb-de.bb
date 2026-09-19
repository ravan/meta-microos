SUMMARY = "German version of moreverb"
DESCRIPTION = "This is a 'translation' of the moreverb documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23957"

RPM_NAME = "texlive-translation-moreverb-de-2026.226.svn23957-59.2.noarch.rpm"
RPM_HASH = "81c37860625500726922fcef5d8c8a2f4aa286d1e585d4007976016d1a4eb4b3d5aab3a2c85da2abcfa282a27449cd40567313361fb273ce9c7c207d68867705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-moreverb-de"

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
