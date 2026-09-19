SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-altera-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "6763243b5d06226f8c78e3e6a87e14f7e2efab8241e8f148aef1ef6758330d6fb19838b518a58bc50b28bf03d1e4743e1ccf122c2c4db82c3259cb262705023f"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
