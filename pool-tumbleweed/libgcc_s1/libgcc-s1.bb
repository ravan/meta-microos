SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libgcc_s1-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "653909a8eaeb0d071a3124ddbf34821f16908c4bfe62095819a33c2c278be42e137cdad67682a9fc3fbdff733ea385471428555d2f4008cd5c23b34f09b61bc9"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
