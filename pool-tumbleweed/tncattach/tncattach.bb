SUMMARY = "Attach KISS TNC devices as network interfaces in Linux"
DESCRIPTION = "Attach KISS TNC devices as network interfaces in Linux. \
This program allows you to attach TNCs or any KISS-compatible device as a \
network interface. This program does not need any kernel modules, and has \
no external dependencies outside the standard Linux and GNU C libraries."
LICENSE = "MIT"

PV = "20241222.c910421"

RPM_NAME = "tncattach-20241222.c910421-1.4.aarch64.rpm"
RPM_HASH = "6c755c4b8f11105c4bc97d77602ea24dadbe74e114c481ee34ef25c596d16eb94182b88e2ebe580f3e816734312d97f0668b3366c23394f7fdf6f571aeffdddb"

RPROVIDES:${PN} += "tncattach"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
