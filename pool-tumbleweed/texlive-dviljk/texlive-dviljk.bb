SUMMARY = "DVI to Laserjet output"
DESCRIPTION = "A dvi driver for the LaserJet printers, using kpathsea \
recursive file searching. Note: this program will not compile \
simply with the sources in this distribution; it needs a full \
(current) kpathsea distribution environment, such as is \
available from the TeX Live source tree."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn66186"

RPM_NAME = "texlive-dviljk-2026.226.svn66186-61.4.noarch.rpm"
RPM_HASH = "ac9c0fb8835b950accb9578cc69a59de551a60077b8a8da34924acd092944ed83e8871cb4f581e7753a1972565b601caed913426a5b79edfdea1979c35d6df02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvihp.1 \
man-dvilj.1 \
man-dvilj2p.1 \
man-dvilj4.1 \
man-dvilj4l.1 \
man-dvilj6.1 \
texlive-dviljk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviljk-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
