SUMMARY = "Header files for libepub library"
DESCRIPTION = "Header files for the libepub library."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "libepub-devel-0.2.2-9.8.aarch64.rpm"
RPM_HASH = "4c9bd3237cf10dd6bbde8f00a950b847be4c14e33041036634b01d44525d8982aa324bbe8f645fff2963b9d819975c1753180f2abbabf2b9ba17ee98ac987df0"

RPROVIDES:${PN} += "libepub-devel"

RDEPENDS:${PN} += "glibc-devel \
libepub0"

inherit rpm
