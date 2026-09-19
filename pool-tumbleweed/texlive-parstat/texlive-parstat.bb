SUMMARY = "A Paragraph statistic package for OpTeX"
DESCRIPTION = "This is a package for the OpTeX format that counts glyphs and \
spaces on paragraph lines. From these numbers a statistic is \
made, which is printed into the logfile."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77123"

RPM_NAME = "texlive-parstat-2026.226.1.0svn77123-58.2.noarch.rpm"
RPM_HASH = "745ef849d2cc94d3a8c20b6a5b03fe866213dc438492135ebfceedd91771bee1cd0b8df651de85e97bdf68a81077d28a16fe492d085b4be8901e855b25709ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parstat"

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
