SUMMARY = "Unofficial BibTeX style for citing Japanese articles in IEEE format"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors \
trying to cite Japanese articles in the Institute of Electrical \
and Electronics Engineers (IEEE) format."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn76924"

RPM_NAME = "texlive-jieeetran-2026.226.0.0.19svn76924-63.2.noarch.rpm"
RPM_HASH = "0e9b5169f79841d7f41861fba9822d80541cd5b15b6c5f319eceddef34777e4fc58417833cf26acb2c3fbf9d14f5f8fbb0e89cb78c2afd76df68eddcb8282e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jieeetran"

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
