SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "libgccjit0-devel-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "5b8dd8e2f952f7265e7947bcb0271d918fb5d2fdc71e3b974ea0d6581ab37d0f1db1e86e9d5cf002a442f82ee0586847b589bfd7e9cccf2c993382d9edc1de59"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc14"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
