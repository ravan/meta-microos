SUMMARY = "Download Firmware into USB FX and FX2 Devices"
DESCRIPTION = "This program can download firmware into FX, FX2 and FX3 \
(thanks to the patch from Steven J. Magnani) EZ-USB devices as \
well as the original AnchorChips EZ-USB.  It is intended to be invoked \
by hotplug scripts when the unprogrammed device appears on the bus. \
 \
Primarily as an aid for developers, this can also be used to update \
firmware on devices that boot from I2C serial EEPROMs.	For that use, \
as well as downloading firmware to all other off-chip memory, a second \
stage loader must first be downloaded."
LICENSE = "LGPL-2.1-or-later"

PV = "2013_01_03"

RPM_NAME = "fxload-2013_01_03-2.12.aarch64.rpm"
RPM_HASH = "476b948a0912737e2bc873361c65c3c6ceaef5c2ddf720bd0eafbb758cc0b3e0106064148c67d2c0d67d4dec56967f6ac3e4a10f2cf39577ca992dcaeb2f9394"

RPROVIDES:${PN} += "fxload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
