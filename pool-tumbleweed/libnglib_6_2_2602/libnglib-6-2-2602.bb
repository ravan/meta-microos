SUMMARY = "NETGEN mesher main library"
DESCRIPTION = "NETGEN mesh generator main shared library."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "libnglib_6_2_2602-6.2.2602-3.5.aarch64.rpm"
RPM_HASH = "efbd72a6e103e5a5a531811fdc967292320db56b4e7041017eba613ae9487113cacd5b82050f1ea0ef518530b943498b4806ee87f7eb79b5a536cc51f94b3d6e"

RPROVIDES:${PN} += "libnglib-6-2-2602 \
libnglib.so.6.2.2602"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libTKBO.so.7.9.3 \
libTKBRep.so.7.9.3 \
libTKBool.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKDESTL.so.7.9.3 \
libTKFillet.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomAlgo.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKOffset.so.7.9.3 \
libTKPrim.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libngcore.so.6.2.2602 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
