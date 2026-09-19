SUMMARY = "Development files for Csound"
DESCRIPTION = "Development files for Csound, a sound synthesis program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-devel-6.18.1-6.4.aarch64.rpm"
RPM_HASH = "40952edb747ad728a14df5f72a773b5fb5e3e6eebc3def6b3748ee446e7f8a06a7de7728906e2d1136fac439df25cd745c6090fba8bd6e287ed4f177a8d9709f"

RPROVIDES:${PN} += "csound-devel"

RDEPENDS:${PN} += "libcsnd6-6-0 \
libcsound64-6-0"

inherit rpm
