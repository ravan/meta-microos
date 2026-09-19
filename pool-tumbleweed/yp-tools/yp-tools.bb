SUMMARY = "Network Information Service (YP) client utilities"
DESCRIPTION = "This packages contains some useful tools for accessing NIS maps or to \
test NIS configurations."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.2.3"

RPM_NAME = "yp-tools-4.2.3-3.22.aarch64.rpm"
RPM_HASH = "c3594beb6ced79966108379ced3f35407c05c1f83ca6162897e062ffd7d683191ba845bc7c45704a1380b5b7181818c13bdf97e7fca2f1c916ad85e2879372f2"

RPROVIDES:${PN} += "yp-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libnsl.so.3 \
libtirpc.so.3"

inherit rpm
