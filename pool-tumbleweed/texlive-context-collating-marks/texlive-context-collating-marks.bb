SUMMARY = "Environment to place collating marks on the spine of a section"
DESCRIPTION = "This module provides a possibility to place collating marks on \
the spines of sections when using imposition. Placing collating \
marks is a method to make the correct sequence of sections of a \
book block visible."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn68696"

RPM_NAME = "texlive-context-collating-marks-2026.226.svn68696-61.2.noarch.rpm"
RPM_HASH = "338c7ae75e919af9d9fd31267eeacb9fe08da79bf3655b7c9375a56b091e91953d165e389917899e2d6cbcd1a347f62a17395c4827bb33716a820397894f63cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-collating-marks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
