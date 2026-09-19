SUMMARY = "Certificate Enrollment through CEP/CES"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
It currently only operates through certmonger."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.16"

RPM_NAME = "cepces-0.3.16-1.4.noarch.rpm"
RPM_HASH = "e3fdab19ee872762d3b089a5ca582a3537adaa10c5481ee1e2a007b73ee8e2e18834dcd8e89e08e4f50a3eb871991b01ff92189540f9bcb03f4ffca3f8760af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces \
config-cepces"

RDEPENDS:${PN} += "cepces-certmonger \
python3-cepces"

inherit rpm
