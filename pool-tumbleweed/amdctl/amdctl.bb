SUMMARY = "Set P-State voltages and clock speeds on recent AMD CPUs on Linux"
DESCRIPTION = "Set P-State voltages and clock speeds on recent AMD CPUs on Linux."
LICENSE = "GPL-3.0-only"

PV = "0.11"

RPM_NAME = "amdctl-0.11-1.11.aarch64.rpm"
RPM_HASH = "7661767f56712dca863b15d5458798d85f2b72ac0ef0e09a26a556266120e15625af9046efc3a3dc84d6d3376ae1141b37b1f11a830c0f98548db15bd212017c"

RPROVIDES:${PN} += "amdctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
