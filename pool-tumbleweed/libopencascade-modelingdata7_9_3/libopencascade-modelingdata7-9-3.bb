SUMMARY = "OpenCASCADE modeling data libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKG2d TKG3d TKGeomBase TKBRep"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-modelingdata7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "3d17fb8f2e128e075e698c8ddf55e95c1906c7380fcef00f781bcdccb9a8f9cec695cdd16a27202adc9030314d72f126bf0138eb1e18df35a570c077ba018f5e"

RPROVIDES:${PN} += "libTKBRep.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libopencascade-modelingdata7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKMath.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
