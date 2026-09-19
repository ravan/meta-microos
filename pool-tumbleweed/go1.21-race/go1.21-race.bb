SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.21.13"

RPM_NAME = "go1.21-race-1.21.13-11.2.aarch64.rpm"
RPM_HASH = "7c6adbec77e0e4c1822cee10eecd0f6a7b5cd7bb0eb2d934167d7b0a3065a305c35f214da7d716a578a8a0d4f63d3eceff695aedc8bd08486a0c31fa9aeb1ac1"

RPROVIDES:${PN} += "go1.21-race"

RDEPENDS:${PN} += "go1.21"

inherit rpm
