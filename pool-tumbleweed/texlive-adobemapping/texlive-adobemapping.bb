SUMMARY = "Adobe cmap and pdfmapping files"
DESCRIPTION = "The package comprises the collection of CMap and PDF mapping \
files made available for distribution by Adobe."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn66552"

RPM_NAME = "texlive-adobemapping-2026.226.svn66552-61.2.noarch.rpm"
RPM_HASH = "5484096717ee66a03ae475771bd7d385f66a9d8be3f5f87b4183407210dec18aeb6a8ab22af388c03394fda9be34ba70adb228ea07c7966290f8064077cd6146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adobemapping"

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
