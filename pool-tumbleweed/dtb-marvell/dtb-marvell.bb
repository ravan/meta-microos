SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-marvell-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "123b4e615a9668b14c2c3bd8de14becbca1d873119671949fddb42ae8b2adc22e9070b51edda189718b135c50911915426f4ef6d4edff1f3abff038eabed6b7c"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
