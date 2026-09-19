SUMMARY = "Italian translation of amsldoc"
DESCRIPTION = "The amsldoc-it package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45662"

RPM_NAME = "texlive-amsldoc-it-2026.226.svn45662-61.2.noarch.rpm"
RPM_HASH = "6a01673000e6a585d4604982a30dd9e0871e16350c91f3b55bdbd9970c3bc8f99635de16fe2113db898c3962f837ff91fb3495e1137aebff7bbd32799ca14ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsldoc-it"

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
