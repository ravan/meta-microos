SUMMARY = "Typesafe Signal Framework for C++"
DESCRIPTION = "This library implements a full callback system for use in widget \
libraries, abstract interfaces, and general programming. It is the most \
complete library of its kind with the ability to connect an abstract \
callback to a class method, function, or function object. It contains \
adaptor classes for connection of dissimilar callbacks and has an ease \
of use unmatched by other C++ callback libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.8.0"

RPM_NAME = "libsigc-3_0-0-3.8.0-2.3.aarch64.rpm"
RPM_HASH = "494666759fc246a97c2c48d836c2c7b84f46b0ae63d21b303ac4be7c9170c7430f7707d90fa8220de73e97c72fa72076e14745b94918902fc9f78f6213207cf7"

RPROVIDES:${PN} += "libsigc++3 \
libsigc-3-0-0 \
libsigc-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
