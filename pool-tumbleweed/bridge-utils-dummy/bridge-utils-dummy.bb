SUMMARY = "Dummy implementation for obsolete network commands"
DESCRIPTION = "As many people are still trying to use deprecated net-tools utilities \
without realizing its obsolete status, this package provides a useful \
feedback how to proceed."
LICENSE = "CC0-1.0"

PV = "0.1"

RPM_NAME = "bridge-utils-dummy-0.1-1.3.noarch.rpm"
RPM_HASH = "a0df5a25e6984bc42ce4d826c8e8c0f7911efe5134483f04bf230726fa6d7dbd16a3a149d22eae76181e5179c6fa37cef9147491e614d01158d51eb8c1f38cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bridge-utils-dummy"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
