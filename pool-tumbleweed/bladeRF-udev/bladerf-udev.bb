SUMMARY = "Udev rules for bladeRF"
DESCRIPTION = "Udev rules for bladeRF."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2025.10"

RPM_NAME = "bladeRF-udev-2025.10-22.3.aarch64.rpm"
RPM_HASH = "80ee193868db27a8576f7e3c8bd3474102ef31e56cbb24f959bfaa5748e66a54a4b95c974c13075893d34fe9b676665d463da181fb5e5ceb8a9053a761a1ee94"

RPROVIDES:${PN} += "bladeRF-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
