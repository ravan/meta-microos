SUMMARY = "Utility for Controlling Magnetic Tape Drives"
DESCRIPTION = "mt-st tools contains two programs: mt and stinit, used for dealing \
with Linux-specific tape-drive handling. mt program is tailored for \
SCSI tape drives, but it can also be used with other Linux tape \
drivers that use the same ioctls. The program stinit is meant for \
initializing of SCSI tape drive modes at system startup, or when \
new tape drivers are added."
LICENSE = "GPL-2.0-or-later"

PV = "1.8"

RPM_NAME = "mt-st-1.8-1.5.aarch64.rpm"
RPM_HASH = "dd4ae88e0c90dfb907bde580971a8617a49cc77e21ad78bf01439ac5a5babecb403cc86f49eceeeb390367d526719e933e3029ac523503669961ab05cdce6c9f"

RPROVIDES:${PN} += "config-mt-st \
mt \
mt-st"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
