SUMMARY = "Document class for theses at University of Alaska Fairbanks"
DESCRIPTION = "This is an 'unofficial' official class."
LICENSE = "LPPL-1.0"

PV = "2026.226.12.12svn57349"

RPM_NAME = "texlive-uafthesis-2026.226.12.12svn57349-59.2.noarch.rpm"
RPM_HASH = "b390061e92a69b92a2b82965154e5969ef5af92e1fbb11b60821b85b911bdb5083c6dbc7ae2d15b31b1fe9b0e6717264cf41b56195fff2359047e4b97569632b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uafthesis.cls \
texlive-uafthesis"

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
