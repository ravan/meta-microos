SUMMARY = "Development files for libturris-spectator"
DESCRIPTION = "The libturris-spectator-devel package contains libraries and header files for \
developing applications that use libturris-spectator."
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "libturris-spectator-devel-0.6+git74.9ef0de5-1.38.aarch64.rpm"
RPM_HASH = "0ed570e4423d7b9eb31907930b13206f702fb4e819039d42d939cfa981ca853dec743b97a73f812b963c5c8a8dfb177383e771762aa983a267584446d3073ad1"

RPROVIDES:${PN} += "libturris-spectator-devel"

RDEPENDS:${PN} += "libturris-spectator0"

inherit rpm
