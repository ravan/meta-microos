SUMMARY = "GtkD gstreamerd library"
DESCRIPTION = "This package contains the GtkD gstreamerd library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgstreamerd-3-0-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "316823079d798bb999d01eae6d2e742c04dce87c078dfc50c75fd40c2330d48366c148cf78936b0931ee54843c276136648ea8dbcc395f2771e4cf32ea8ad7bf"

RPROVIDES:${PN} += "libgstreamerd-3-0 \
libgstreamerd-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1"

inherit rpm
