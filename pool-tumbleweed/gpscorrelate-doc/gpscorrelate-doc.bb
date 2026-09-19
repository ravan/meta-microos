SUMMARY = "HTML manual for GPS Correlate"
DESCRIPTION = "GPS Correlate stamps the location recorded in a GPS track into the EXIF \
GPS tags of digital photos taken at the same time. \
 \
This package contains the HTML manual in English and French, which is also \
what the graphical interface opens from its Help menu."
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "gpscorrelate-doc-2.3-1.1.noarch.rpm"
RPM_HASH = "4b5f49aaba289a6341429edfb2e2be1bf7ec7ac865ac24b5a7625999ae501d38001a7d9e6ef052dbbfd9ee6f3df57d1f300dec464c99ca1d077136ca3992a547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpscorrelate-doc"

RDEPENDS:${PN} += ""

inherit rpm
