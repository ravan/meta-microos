SUMMARY = "Shared library for CLHEP GenericFunctions"
DESCRIPTION = "This package provides the CLHEP GenericFunctions shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-GenericFunctions-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "a4ae1d22ce2d12651b62ace40b6408836390ea8635f15bbe23c911e190afb231ad0be9af682d7be8e75d8f4b3d8337d83d02ef04196a81cd374ea480821e0ba6"

RPROVIDES:${PN} += "libCLHEP-GenericFunctions-2-4-7-2 \
libCLHEP-GenericFunctions-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
