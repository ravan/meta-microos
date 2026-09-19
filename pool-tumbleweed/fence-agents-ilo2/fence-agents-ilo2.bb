SUMMARY = "Fence agents for HP iLO2 devices"
DESCRIPTION = "Fence agents for HP iLO2 devices that are accessed via \
the HTTP(s) protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ilo2-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "eec95f9c0bd7c2da8002e4a510e0f275e45f016ca25683444e1a2ba6b158ff9f2d6982790edd9a7e481d1cefc9674b94b679a26eaa5c3d72d3bdd1ecad17c873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ilo2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
gnutls"

inherit rpm
