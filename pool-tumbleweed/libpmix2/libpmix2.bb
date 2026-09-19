SUMMARY = "PMI-X lib version 1"
DESCRIPTION = "This package contains the shared library used by the PMI-X standard"
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "libpmix2-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "085555da25545dcc012ebc5a272620618f26584ab8993970fe912f6f08bb17b7002db5f2734c961cbf5046a8ec9c0469edc8609da3fac3f1ef81c5c9fa6b4e27"

RPROVIDES:${PN} += "libpmix.so.2 \
libpmix2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libhwloc.so.15 \
pmix-plugins \
pmix-runtime-config"

inherit rpm
