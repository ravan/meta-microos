SUMMARY = "Dummy implementation for obsolete network commands"
DESCRIPTION = "As many people are still trying to use deprecated net-tools utilities \
without realizing its obsolete status, this package provides a useful \
feedback how to proceed."
LICENSE = "CC0-1.0"

PV = "0.1"

RPM_NAME = "net-tools-dummy-0.1-1.3.noarch.rpm"
RPM_HASH = "1ecf4d8f877782d67acb3a0ebcc859f1c088fbea6d1661c74c3f58f44dc5c4d9d462f06a26e2c3f453a29c7c645c5d8cd3747b6c411488204ee3833b66bd1e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "net-tools-dummy"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
