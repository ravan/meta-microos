SUMMARY = "Development libraries for BLACS (openmpi4)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi4."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-openmpi4-devel-static-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "4f921f2891c9a48c48c7a1a75104a20ebf84d33b17ca66c8572c1719684a420701b7850d407d796bf046e01bb9994dace3b73b8e4c9d9b1faa832ed169519ec0"

RPROVIDES:${PN} += "libblacs2-openmpi4-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi4-devel"

inherit rpm
