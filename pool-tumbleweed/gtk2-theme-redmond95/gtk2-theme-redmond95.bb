SUMMARY = "Redmond Theme for GTK+ 2"
DESCRIPTION = "The Redmond engine and theme are designed to mimic the appearance of \
another well known OS."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-redmond95-2.20.2-23.6.noarch.rpm"
RPM_HASH = "461fec3b32306d806dda35f59ee4538d725825d2c0c17f5638c9e03a112d4383805e6f5349af47ffb8bbfb6426994aff95f4ca8111f46d0e4807728fda5a4bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-redmond95"

RDEPENDS:${PN} += "gtk2-engine-redmond95"

inherit rpm
