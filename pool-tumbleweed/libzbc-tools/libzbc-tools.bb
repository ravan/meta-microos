SUMMARY = "Command line utilities for ZBC/ZAC disk manipulation"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC), Zoned-device ATA command set (ZAC) disks."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libzbc-tools-6.2.0-1.9.aarch64.rpm"
RPM_HASH = "1d99f580c9863ee640afa851cd04282d5266de5540b3c7d924c40e208c14c9b109cb653b18246a3283bac5af628be775a88bc394359bbe95debd2629f8220894"

RPROVIDES:${PN} += "libzbc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzbc.so.6"

inherit rpm
