SUMMARY = "Abseil library liblibabsl_hashtable_profiler"
DESCRIPTION = "This package contains the libabsl_hashtable_profiler library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_hashtable_profiler2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "f10b76c3cf382abf2875c19c6a4d1cbe98689939d353b4d3e323701661b2808e9953df9539d7048151a4fb95b9efcad2acdaaf7dd31207cb0d4c0b2c0865e335"

RPROVIDES:${PN} += "libabsl-hashtable-profiler.so.2608.0.0 \
libabsl-hashtable-profiler2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-hashtablez-sampler.so.2608.0.0 \
libabsl-profile-builder.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
