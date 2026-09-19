SUMMARY = "C++ base library of Heinz Maier-Leibnitz Zentrum"
DESCRIPTION = "Header-only C++ base library of Heinz Maier-Leibnitz Zentrum."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "libheinz-devel-3.0.0-1.3.noarch.rpm"
RPM_HASH = "b7da75aa8104f465e4789f4449a2b63ab31a371557658c86e8e997c829fcf22f7a69aa3230bd475702f1f2db4fcef256519a9fbeb305686e25e904e387b8b51c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-LibHeinz \
libheinz-devel"

RDEPENDS:${PN} += ""

inherit rpm
