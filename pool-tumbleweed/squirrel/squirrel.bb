SUMMARY = "A high level imperative/OO programming language"
DESCRIPTION = "Squirrel is a programming language featuring higher-order functions, \
classes, inheritance, delegation, tail recursion, generators, \
cooperative threads, exception handling, reference counting, garbage \
collection on demand, and a C-like syntax."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-3.2-4.6.aarch64.rpm"
RPM_HASH = "7bf128261c1ccaf59a00d4499371d494215f24cda53e61c2b32496d817aeeeafaa81dc87c0f05e9c314e6b799d26088f5f317f706ef254e422de178e027f276d"

RPROVIDES:${PN} += "squirrel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqstdlib3.so.1001 \
libsquirrel3.so.1001"

inherit rpm
