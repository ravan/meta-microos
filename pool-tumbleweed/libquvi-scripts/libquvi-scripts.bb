SUMMARY = "Lua scripts used by libquvi"
DESCRIPTION = "libquvi-scripts contains the embedded lua scripts that libquvi uses for \
parsing the media details. Some additional utility scripts are also \
included."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.20131130"

RPM_NAME = "libquvi-scripts-0.9.20131130-4.15.aarch64.rpm"
RPM_HASH = "3a54bf006fc6bcf4cf7b4dcbfb89532bc8dc187cc5b39f8c5e067f9347305f33eeb08f62ee91bc5b081c994bd9395681e33e66aa7d387a27a77ad43e2b49c05f"

RPROVIDES:${PN} += "libquvi-scripts"

RDEPENDS:${PN} += ""

inherit rpm
