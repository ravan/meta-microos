SUMMARY = "A class library for high energy physics"
DESCRIPTION = "CLHEP is intended to be a set of high energy physics specific \
foundation and utility classes such as random generators, physics \
vectors, geometry and linear algebra. CLHEP is structured in a set of \
packages independent of any external package (interdependencies within \
CLHEP are allowed under certain conditions). \
 \
This package provides the shared libraries for CLHEP."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "ce4c2dea77873c42318934b69bfdd6aec671934a6c66f33b6e02eda64ba7027730802861c803329b0fe3797e2be3e60f22488377810a348d5720efa95b7ebe67"

RPROVIDES:${PN} += "clhep \
libCLHEP-2-4-7-2 \
libCLHEP-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
