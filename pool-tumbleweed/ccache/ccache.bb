SUMMARY = "A Fast C/C++ Compiler Cache"
DESCRIPTION = "ccache is a compiler cache. It speeds up recompilation by caching the \
result of previous compilations and detecting when the same compilation is \
being done again. Supported languages are C, C++, Objective-C and \
Objective-C++."
LICENSE = "GPL-3.0-or-later"

PV = "4.14"

RPM_NAME = "ccache-4.14-2.1.aarch64.rpm"
RPM_HASH = "da19f03230f034443a149f34bd1e13e6a2688ad09406d657ece348116276aa3150842bf9087e4cf9c3e997c635ff94ee03f306ed1a46f4674e03ebb07f9b3354"

RPROVIDES:${PN} += "ccache \
distcc-/usr/bin/ccache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpp-httplib.so.0.49 \
libfmt.so.12 \
libgcc-s.so.1 \
libhiredis.so.1.3.0 \
libm.so.6 \
libstdc++.so.6 \
libxxhash.so.0 \
libzstd.so.1"

inherit rpm
