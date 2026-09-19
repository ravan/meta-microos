SUMMARY = "Search engine for music related metadata"
DESCRIPTION = "The Glyr shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libglyr1-1.0.10-5.4.aarch64.rpm"
RPM_HASH = "f4209962c4d69ea43cfcaaff2e2be924ea2955f219f2bcca366105d739d558fcbe5b3727c03a72d029bd7d432a5277def943d7f4c3d3eb28d0f004650062b9cb"

RPROVIDES:${PN} += "libglyr.so.1 \
libglyr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
