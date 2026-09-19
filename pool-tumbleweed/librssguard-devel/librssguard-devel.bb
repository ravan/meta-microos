SUMMARY = "Development headers for librssguard-5_2_5"
DESCRIPTION = "Development headers to be used with librssguard-5_2_5."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only"

PV = "5.2.5"

RPM_NAME = "librssguard-devel-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "52816a2bb43a1dcc582cf81b3bfb53952da3500fae69cdd060efb42806495e4f410f9bdbefe6902c5777880f5bdd70831407e20861f34196622202e53c861026"

RPROVIDES:${PN} += "librssguard-devel"

RDEPENDS:${PN} += "librssguard-5-2-5"

inherit rpm
