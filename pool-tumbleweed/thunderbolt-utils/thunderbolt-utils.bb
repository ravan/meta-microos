SUMMARY = "User-space utilities for Thunderbolt/USB4"
DESCRIPTION = "This software is a collection of various user-space functionalities \
for the thunderbolt/USB4 subsystem."
LICENSE = "LGPL-2.0 & GPL-2.0"

PV = "0.1~rc1"

RPM_NAME = "thunderbolt-utils-0.1~rc1-1.11.aarch64.rpm"
RPM_HASH = "62bdc52d8f55952051f2f8e243158d5ff91ffb9df77a9f382e93b0d6f901e69db77e5ac378b2003768b132ad6fdb68949082009e00b9381b0c5b73ad0322df36"

RPROVIDES:${PN} += "thunderbolt-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
