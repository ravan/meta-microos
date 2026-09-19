SUMMARY = "Firmware dump utility"
DESCRIPTION = "An utility to automatically dump firmware dumps to /var/log/."
LICENSE = "GPL-2.0-only"

PV = "1"

RPM_NAME = "iwlfwdump-1-1.9.noarch.rpm"
RPM_HASH = "2c02743310556640a1b2d438c320186a45d189a92058e297c75061b83b2acefad8c3b37b2956b9c663928a9ede9ca2a44786b96ef1d8b883c38676fcab37de77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iwlfwdump"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
