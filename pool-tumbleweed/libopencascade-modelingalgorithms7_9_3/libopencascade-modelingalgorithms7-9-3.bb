SUMMARY = "OpenCASCADE modeling algorithms libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKGeomAlgo TKTopAlgo TKPrim TKBO TKShHealing TKBool \
  TKHLR TKFillet TKOffset TKFeat TKMesh TKXMesh"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-modelingalgorithms7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "1f78d073878fe0f1ed80088b7a78edf577e8c07110789cef29db45e7479b009d7289c0c2ae9beccc457727bf99893a0b36c911f44aa9e8969d7174b4ad2a5595"

RPROVIDES:${PN} += "libTKBO.so.7.9.3 \
libTKBool.so.7.9.3 \
libTKFeat.so.7.9.3 \
libTKFillet.so.7.9.3 \
libTKGeomAlgo.so.7.9.3 \
libTKHLR.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKOffset.so.7.9.3 \
libTKPrim.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKXMesh.so.7.9.3 \
libopencascade-modelingalgorithms7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBRep.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
