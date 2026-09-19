SUMMARY = "A garbage collector for C and C++"
DESCRIPTION = "The Boehm-Demers-Weiser conservative garbage collector can be used as a \
garbage collecting replacement for C malloc or C++ new. It allows you \
to allocate memory basically as you normally would, without explicitly \
deallocating memory that is no longer useful. The collector \
automatically recycles memory when it determines that it can no longer \
be otherwise accessed."
LICENSE = "BSD-3-Clause"

PV = "8.2.12"

RPM_NAME = "gc-devel-8.2.12-1.3.aarch64.rpm"
RPM_HASH = "54be9076ff5e7ef4a48a4277a2b701dc5d055a352793615444f9f6e211d69ba9e6d2f23f88ec6be3f8a15c57e53c00a4c3b5f7f99fca8d9a7fc82929c122e9e8"

RPROVIDES:${PN} += "gc-/usr/include/gc/gc.h \
gc-devel \
pkgconfig-bdw-gc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libatomic-ops-devel \
libgc1"

inherit rpm
