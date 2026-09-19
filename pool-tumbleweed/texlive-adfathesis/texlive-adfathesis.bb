SUMMARY = "Australian Defence Force Academy thesis format"
DESCRIPTION = "The bundle includes a BibTeX style file."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.42svn26048"

RPM_NAME = "texlive-adfathesis-2026.226.2.42svn26048-61.2.noarch.rpm"
RPM_HASH = "760d2a47df19d0da2178b4658392f3979567aaabde7bca48d834ac33d8883ec2ad3298733f07851f1a996cab842c5b22847a593c80f67d241fee0b6d4967d366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adfathesis.cls \
texlive-adfathesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-harvard.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
