SUMMARY = "Firmware required to run the SbsaQemu"
DESCRIPTION = " \
 \
 \
Firmware required to run the SbsaQemu"
LICENSE = "SUSE-Firmware"

PV = "202502"

RPM_NAME = "edk2-SbsaQemu-202502-5.3.aarch64.rpm"
RPM_HASH = "ca5a9170f9f4b465d258704a75aec7ae34375bdec2afccc989670590021e87116b1e0c99970174ece728e8b93cdbaf5c4570b0eb4f5d95966e2fffd17a48ff97"

RPROVIDES:${PN} += "edk2-SbsaQemu"

RDEPENDS:${PN} += ""

inherit rpm
