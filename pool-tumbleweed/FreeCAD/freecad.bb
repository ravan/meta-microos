SUMMARY = "General Purpose 3D CAD Modeler"
DESCRIPTION = "FreeCAD is a parametric 3D modeler made primarily to design real-life objects \
of any size. Parametric modeling allows modifying designs by \
going back into the model history and changing its parameters. FreeCAD is \
customizable and scriptable."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "FreeCAD-1.1.3-1.1.aarch64.rpm"
RPM_HASH = "ae8e64c48c795d6a9390735eb5c06ff77752ce5d47cc742c63d245456572eb8e6a2b6558641475884e89330bbb8b30fefdae5a6e7ee8bfeb1775f47baa29fcae"

RPROVIDES:${PN} += "FreeCAD \
freecad \
libDriver.so \
libDriverDAT.so \
libDriverSTL.so \
libDriverUNV.so \
libE57Format.so.3 \
libFreeCADApp.so \
libFreeCADBase.so \
libFreeCADGui.so \
libMEFISTO2.so \
libNETGENPlugin.so \
libOndselSolver.so.1 \
libSMDS.so \
libSMESH.so \
libSMESHDS.so \
libStdMeshers.so \
libarea-native.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libGL.so.1 \
libGLESv2.so.2 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libTKBO.so.7.9.3 \
libTKBRep.so.7.9.3 \
libTKBool.so.7.9.3 \
libTKCAF.so.7.9.3 \
libTKCDF.so.7.9.3 \
libTKDEGLTF.so.7.9.3 \
libTKDEIGES.so.7.9.3 \
libTKDESTEP.so.7.9.3 \
libTKDESTL.so.7.9.3 \
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
libTKPrim.so.7.9.3 \
libTKRWMesh.so.7.9.3 \
libTKService.so.7.9.3 \
libTKShHealing.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKXCAF.so.7.9.3 \
libTKXSBase.so.7.9.3 \
libTKernel.so.7.9.3 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libfmt.so.12 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libicuuc.so.78 \
libm.so.6 \
libmedC.so.11 \
libngcore.so.6.2.2602 \
libnglib.so.6.2.2602 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libspnav.so.0 \
libstdc++.so.6 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMisc.so.1 \
libvtkCommonTransforms.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkIOCore.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOXML.so.1 \
libvtkWrappingPythonCore3.13.so.1 \
libvtksys.so.1 \
libxerces-c-3.3.so \
libyaml-cpp.so.0.9 \
libz.so.1 \
python-abi \
python3-PyYAML \
python3-matplotlib \
python3-numpy \
python3-pivy \
python3-ply \
python3-pyside6 \
python3-six \
python3-typing-extensions \
python3-vtk"

inherit rpm
