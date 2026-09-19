SUMMARY = "S-expressions parser and generator library"
DESCRIPTION = "This is a C++ library for working with S-expressions. S-expressions \
are a data structure for representing complex data as a variation on \
LISP S-expressions."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "sexpp-0.9.2-1.5.aarch64.rpm"
RPM_HASH = "53ca50410633822aa81fb27faaaf1cb864be24545eead63dfb4eb061874e5b4a6300fa41c44ebf75ee3733077ce9cea92fb75fff3c799cd9c293e02d0993170d"

RPROVIDES:${PN} += "sexpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsexpp.so.0 \
libstdc++.so.6"

inherit rpm
