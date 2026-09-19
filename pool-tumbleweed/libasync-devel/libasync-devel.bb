SUMMARY = "SvxLink Async development files"
DESCRIPTION = "The Async library development files"
LICENSE = "GPL-2.0-only"

PV = "1.9.1"

RPM_NAME = "libasync-devel-1.9.1-7.1.aarch64.rpm"
RPM_HASH = "de520876d589fa1c40880836976ed81f3ae6e0bd585e0b002cacb95919905df796960e5dd923c2eebf278b5d0411aaedd1d8b6ed43bb3505f78410326c3ea836"

RPROVIDES:${PN} += "libasync-devel"

RDEPENDS:${PN} += "libasync1-9"

inherit rpm
