SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "libgccjit0-devel-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "e0657cfafee5239ecbd116c2fc2ce78bc0d2ee6a614eff0a67e514f686b5f92c27c23422f72c89d37651d052eaa0f59b22d1207104e82593e4269c31d637b4c4"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
