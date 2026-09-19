SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.24.13"

RPM_NAME = "go1.24-race-1.24.13-5.2.aarch64.rpm"
RPM_HASH = "242ea5692be430dc6048edf0c538dba3694029b0e7682862969e5f7ca9ab5aba6df1ea8189fcb9a8a65f6b072aee96537168e43c7c7334bbf8976fa53e5189c7"

RPROVIDES:${PN} += "go1.24-race"

RDEPENDS:${PN} += "go1.24"

inherit rpm
