SUMMARY = "Firmware for the hackRF board"
DESCRIPTION = "Firmare files for the hackRF board."
LICENSE = "GPL-2.0-only"

PV = "2026.01.3"

RPM_NAME = "hackrf-firmware-2026.01.3-1.4.noarch.rpm"
RPM_HASH = "584694e6d1e4a9c78fef5b113eebfb028249568930dfbfe9bac16a5e91af7ffa5e3c57b66e5ffd795c51a611753a6b386d3b81be3adafdd7f560c1bf430db3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hackrf-firmware"

RDEPENDS:${PN} += "hackrf"

inherit rpm
