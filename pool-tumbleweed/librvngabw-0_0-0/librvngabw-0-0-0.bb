SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-0_0-0-0.0.3-2.11.aarch64.rpm"
RPM_HASH = "cd48e44da4f834f804d5b88a8efc7bf917ba44fa842e8d88b66fb1864ea49b4cd76e6724928e61a5f9d7f6ee1237fc3469c65d97232d5bcbade1839b68740e3b"

RPROVIDES:${PN} += "librvngabw-0-0-0 \
librvngabw-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
