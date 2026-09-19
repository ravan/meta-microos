SUMMARY = "OpenCASCADE plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the OpenCASCADE plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-opencascade-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "15e452205be1a4fd9fb17dbcc7a20ee9221b83c95fbf655566e08b8e770756082a22c504cac7e5003685ffb880957e78242ceb59decfa87fe19d3b43565676e1"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-opencascade \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-opencascade.so \
OpenSceneGraphPlugin-ext-iges \
OpenSceneGraphPlugin-ext-step"

RDEPENDS:${PN} += "libTKBRep.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKMesh.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libosg.so.161 \
libosgDB.so.161 \
libosgUtil.so.161 \
libstdc++.so.6"

inherit rpm
