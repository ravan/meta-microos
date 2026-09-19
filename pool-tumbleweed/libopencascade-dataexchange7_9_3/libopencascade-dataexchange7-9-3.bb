SUMMARY = "OpenCASCADE data exchange libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE data exchange module: \
  TKVCAF TKXSBase TKSTEPBase TKSTEPAttr TKSTEP209 TKSTEP \
  TKIGES TKXCAF TKXDEIGES TKXDESTEP TKSTL TKVRML TKXmlXCAF \
  TKBinXCAF TKRWMesh"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-dataexchange7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "6849ff7dbe66bde9b4847b98802e3c80720849104accec54e10acc8caf2daea59233b8edc4a3b3bfb9473d525649ee0769bd5228ace933590695a8f11cc18581"

RPROVIDES:${PN} += "libTKBinXCAF.so.7.9.3 \
libTKDE.so.7.9.3 \
libTKDECascade.so.7.9.3 \
libTKDEGLTF.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKDEOBJ.so.7.9.3 \
libTKDEPLY.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKDESTL.so.7.9.3 \
libTKDEVRML.so.7.9.3 \
libTKExpress.so.7.9.3 \
libTKRWMesh.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKXmlXCAF.so.7.9.3 \
libopencascade-dataexchange7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBRep.so.7.9.3 \
libTKBin.so.7.9.3 \
libTKBinL.so.7.9.3 \
libTKBinTObj.so.7.9.3 \
libTKBool.so.7.9.3 \
libTKCAF.so.7.9.3 \
libTKCDF.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomAlgo.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKHLR.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKPrim.so.7.9.3 \
libTKService.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKStd.so.7.9.3 \
libTKStdL.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKV3d.so.7.9.3 \
libTKVCAF.so.7.9.3 \
libTKXml.so.7.9.3 \
libTKXmlL.so.7.9.3 \
libTKXmlTObj.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
