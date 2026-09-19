SUMMARY = "Extract files from Wise installers without executing them"
DESCRIPTION = "The aim of this project is to extract assets from old game installers \
made with Wise installer without executing the PE/NE file (.exe), so \
they can be used with free software implementations of the game engine."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "rewise-0.3.1-1.7.aarch64.rpm"
RPM_HASH = "89a08b0e1e958ff3434374fa231f27ce6edecd268c5a5b05ac69cba34a95b408253131cdf3ff3400e9f67351877303cbaf8c8ffb240f85a72118176555b6d2bd"

RPROVIDES:${PN} += "rewise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
