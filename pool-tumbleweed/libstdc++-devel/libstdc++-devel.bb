SUMMARY = "The system GNU C++ development files"
DESCRIPTION = "The system GNU C++ development files."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1"

PV = "16"

RPM_NAME = "libstdc++-devel-16-1.1.aarch64.rpm"
RPM_HASH = "358e007e03d8986cfd74c42278b0654c0ebb9687b877eda8fbe325bccda6a98361b8d8fd4ba9e31146bc3bbb27d6f1371420ba77ac9c837a6f20e88e946b8c12"

RPROVIDES:${PN} += "libstdc++-devel"

RDEPENDS:${PN} += "libstdc++6-devel-gcc16"

inherit rpm
