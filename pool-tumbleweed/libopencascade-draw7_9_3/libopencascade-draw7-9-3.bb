SUMMARY = "OpenCASCADE Draw support libraries"
DESCRIPTION = "This package contains support libraries for the \
OpenCASCADE DRAWEXE test harness."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-draw7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "f0152f40a93b6c5987782fb146f1094cef8e309f5384eeecfb4a4aaff5c372b1c9bb7c649d02c5909fb29b03ad0eacb4ffba921580b11b8b0fad811fa1ad64d4"

RPROVIDES:${PN} += "libTKDCAF.so.7.9.3 \
libTKDraw.so.7.9.3 \
libTKOpenGlTest.so.7.9.3 \
libTKQADraw.so.7.9.3 \
libTKTObjDRAW.so.7.9.3 \
libTKTopTest.so.7.9.3 \
libTKViewerTest.so.7.9.3 \
libTKXDEDRAW.so.7.9.3 \
libTKXSDRAW.so.7.9.3 \
libTKXSDRAWDE.so.7.9.3 \
libTKXSDRAWGLTF.so.7.9.3 \
libTKXSDRAWIGES.so.7.9.3 \
libTKXSDRAWOBJ.so.7.9.3 \
libTKXSDRAWPLY.so.7.9.3 \
libTKXSDRAWSTEP.so.7.9.3 \
libTKXSDRAWSTL.so.7.9.3 \
libTKXSDRAWVRML.so.7.9.3 \
libopencascade-draw7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBO.so.7.9.3 \
libTKBRep.so.7.9.3 \
libTKBin.so.7.9.3 \
libTKBinL.so.7.9.3 \
libTKBinTObj.so.7.9.3 \
libTKBinXCAF.so.7.9.3 \
libTKBool.so.7.9.3 \
libTKCAF.so.7.9.3 \
libTKCDF.so.7.9.3 \
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
libTKFeat.so.7.9.3 \
libTKFillet.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomAlgo.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKHLR.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKMeshVS.so.7.9.3 \
libTKOffset.so.7.9.3 \
libTKOpenGl.so.7.9.3 \
libTKPrim.so.7.9.3 \
libTKRWMesh.so.7.9.3 \
libTKService.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKStd.so.7.9.3 \
libTKStdL.so.7.9.3 \
libTKTObj.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKV3d.so.7.9.3 \
libTKVCAF.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKXml.so.7.9.3 \
libTKXmlL.so.7.9.3 \
libTKXmlTObj.so.7.9.3 \
libTKXmlXCAF.so.7.9.3 \
libTKernel.so.7.9.3 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so \
occt-resources"

inherit rpm
