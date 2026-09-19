SUMMARY = "C API for the CoreSight Trace Decode library"
DESCRIPTION = "C API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "libopencsd_c_api1-1.8.3-1.2.aarch64.rpm"
RPM_HASH = "0e2b2aede571ea15733164799e7e3d88028d57cf7957e3e825e5424b590200d8ae1cae0bb6c152c52bf3da668e9bb0218681f3450eaa40cd905db02c53a45a25"

RPROVIDES:${PN} += "libopencsd-c-api.so.1 \
libopencsd-c-api1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencsd.so.1 \
libstdc++.so.6"

inherit rpm
