SUMMARY = "Swedish bibliography styles"
DESCRIPTION = "The bundle contains Swedish versions of the standard \
bibliography styles, and of the style plainnat. The styles \
should be functionally equivalent to the corresponding original \
styles, apart from the Swedish translations. The styles do not \
implement Swedish collation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-swebib-2026.226.svn76924-64.2.noarch.rpm"
RPM_HASH = "dbabd3f97ee4afe495d4a928646943994a62a4340a732859a15dae3f49e5c5dc7b237552ac8460fb4e259dc92592682c86deb95132086fb976d33ed05a0ceb8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swebib"

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
