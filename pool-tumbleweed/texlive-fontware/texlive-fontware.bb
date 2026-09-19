SUMMARY = "Tools for virtual font metrics"
DESCRIPTION = "Virtual font metrics are usually created in a textual form, the \
Virtual Property List, but programs that use them need to use \
binary files (the Virtual Font and the TeX Font Metric). The \
present two programs translate between the two forms: - vptovf \
takes a VPL file and generates a VF file and a TFM file; - \
vftovp takes a VF file and a TFM file and generates a VPL file. \
The programs are to be found in every distribution of TeX."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-fontware-2026.226.svn77830-60.2.noarch.rpm"
RPM_HASH = "4e7990ee70f8390ed1b1b0ab402c0482913cd4b8e0d09c0078d1282ee6ba468bf80959c1803d10c80693607bf4cf6cd0743809661b5cd73e4f60fc6efbad83c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pltotf.1 \
man-tftopl.1 \
man-vftovp.1 \
man-vptovf.1 \
texlive-fontware"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fontware-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
