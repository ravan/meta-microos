SUMMARY = "Development files for Unified Communication X Memory Hooks"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libucm-devel-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "12733fda805a82c56246bfb28a0fd1c2bbe45678cbf148ea86119af32fd753d26c3e7e71a853cd180d5e08e791838c91186b640cf72b33127724da483c07b30f"

RPROVIDES:${PN} += "libucm-devel"

RDEPENDS:${PN} += "libucm0"

inherit rpm
