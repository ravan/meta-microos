SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_usenglish1-2.2-1.13.aarch64.rpm"
RPM_HASH = "0372f844ec926130ee0cfcbebf2d646f3bbd127de1af241d832c2bb5f4d91a1281366f5394756510d55ced7edd3843453194b94f8e182159184a6ffa463302e3"

RPROVIDES:${PN} += "libflite-usenglish.so.1 \
libflite-usenglish1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflite.so.1"

inherit rpm
