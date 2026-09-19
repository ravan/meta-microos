SUMMARY = "S-expressions parser and generator library"
DESCRIPTION = "This is a C++ library for working with S-expressions. S-expressions \
are a data structure for representing complex data as a variation on \
LISP S-expressions. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "libsexpp0-0.9.2-1.5.aarch64.rpm"
RPM_HASH = "a25e66156787dc51578fdfb27f1648de574239882288390af9db8a5bade78da31bab585ceb9efba9e79426b316c9f6b3cf55f170b5d59a1f259eb77a343cbaba"

RPROVIDES:${PN} += "libsexpp.so.0 \
libsexpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
