SUMMARY = "DigiKam development files"
DESCRIPTION = "Development headers and libraries for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.0"

RPM_NAME = "digikam-devel-9.1.0-1.2.aarch64.rpm"
RPM_HASH = "2db5fbdff813f3c057f39df03f2277e17ad573698463e473027182d09e1d867fbf60f514563defd6440155cc6908f4f414bcbb4e6ba424c2abe5db9f14fec851"

RPROVIDES:${PN} += "cmake-DigikamCore \
cmake-DigikamDatabase \
cmake-DigikamGui \
cmake-DigikamPlugin \
digikam-devel"

RDEPENDS:${PN} += "libdigikamcore9-1-0"

inherit rpm
