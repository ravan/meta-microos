SUMMARY = "OpenCASCADE visualization libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE visualization module: \
  TKService TKV3D TKOpenGL TKMeshVS"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-visualization7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "922ee12383fbb2476bc33826fac596d0e37a8dc5f55f03a687368daf987514f88d36c1f103c4d4e4c30ffee4f07ee3adc5a6d989b1886df8ba87c420e829c2eb"

RPROVIDES:${PN} += "libTKMeshVS.so.7.9.3 \
libTKOpenGl.so.7.9.3 \
libTKService.so.7.9.3 \
libTKV3d.so.7.9.3 \
libopencascade-visualization7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libTKBRep.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomAlgo.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKHLR.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKernel.so.7.9.3 \
libX11.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
