SUMMARY = "UsrMerge tools"
DESCRIPTION = "Tools related to UsrMerge to check the state of the system and to \
convert an existing system to UsrMerge."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-tools-84.87-5.29.aarch64.rpm"
RPM_HASH = "da5f6ef4ef0fa3d8183734a5d303d5810a9682cce4f7af5a6ca3beba5df06ad5b73c1c686ea77a29fcd593667c2e2200c7cf351d1eb74bac23c8bab979be25f5"

RPROVIDES:${PN} += "compat-usrmerge-tools"

RDEPENDS:${PN} += ""

inherit rpm
