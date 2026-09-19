SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "libgccjit0-devel-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "b16070ab4aacb820953646378f8a7e1bf7da88317694385bb853a61ea7f5f1e81de75f232fa996fc421a22116f0cd952e35ddae1b2e816b659e51dbd0d6b0b6d"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc15"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
