SUMMARY = "Firmware required to run the ArmVExpress-FVP-AArch64"
DESCRIPTION = " \
 \
 \
Firmware required to run the ArmVExpress-FVP-AArch64"
LICENSE = "SUSE-Firmware"

PV = "202502"

RPM_NAME = "edk2-ArmVExpress-FVP-AArch64-202502-5.3.aarch64.rpm"
RPM_HASH = "c406359d7f837ac9595d91ffd14d30759980fc782b44c3561bc795b94338eae6cdcf918c89f123eda649121eaf3961e1653b0a364717b74e5c80c5ffdeb8fda9"

RPROVIDES:${PN} += "edk2-ArmVExpress-FVP-AArch64"

RDEPENDS:${PN} += ""

inherit rpm
