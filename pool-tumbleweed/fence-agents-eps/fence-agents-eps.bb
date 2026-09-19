SUMMARY = "Fence agent for ePowerSwitch 8M+ power switches"
DESCRIPTION = "Fence agent for ePowerSwitch 8M+ power switches that are accessed \
via the HTTP(s) protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-eps-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "350914b6e202cbcdf949c3300af77e1f825c43e69c16d8f4a5e32becc6ce4d1f1aa88a77ddc537dcff4dbf10ed87abcd78e720a447b6691f64b5c564a4e6206e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-eps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
