SUMMARY = "Encoding Files for use with libpoppler"
DESCRIPTION = "This package consists of encoding files for use with poppler. The \
encoding files are optional and poppler will automatically read them if \
they are present. When installed, the encoding files enables poppler \
to correctly render CJK and Cyrrilic properly."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only"

PV = "0.4.12"

RPM_NAME = "poppler-data-0.4.12-1.9.noarch.rpm"
RPM_HASH = "2ff37b07758341838dbde8c9021f020adb35e987675bdf69aabe19f316ee85c8804a378b02cf4ca09ef1b12bc4f537d3c5c9fa74c18f10838fca48790cb34fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poppler-data"

RDEPENDS:${PN} += ""

inherit rpm
