SUMMARY = "Developer documentation for pangomm, a C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library. \
This package contains the developer documentation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.56.2"

RPM_NAME = "pangomm-doc-2.56.2-1.3.noarch.rpm"
RPM_HASH = "6d05a6e12824dd29869722db8cc3fa726dbafcfaabd475775578f545b77a50ab89576423cb336bd77c46b2c3416aefaf73f02826455eeb8235c72f04683e39de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pangomm-doc"

RDEPENDS:${PN} += ""

inherit rpm
