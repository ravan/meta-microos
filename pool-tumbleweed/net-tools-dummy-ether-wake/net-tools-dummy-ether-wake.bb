SUMMARY = "Dummy implementation for obsolete network commands"
DESCRIPTION = "As many people are still trying to use deprecated net-tools utilities \
without realizing its obsolete status, this package provides a useful \
feedback how to proceed."
LICENSE = "CC0-1.0"

PV = "0.1"

RPM_NAME = "net-tools-dummy-ether-wake-0.1-1.3.noarch.rpm"
RPM_HASH = "d250574ae9110835fdd5ace9c6159de54a473e4c0ebb0b1d377580127bbd273379c20ed1e55105735521a3c9aa27a767ae3750b9681afd70066f01fc4f115d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "net-tools-dummy-ether-wake"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
