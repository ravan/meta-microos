SUMMARY = "The Visualization Toolkit - A high level 3D visualization library"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides the shared libraries for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.6.1"

RPM_NAME = "libvtk1-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "2d555ce411790f380285d2276fa311bc4fedea8c205bc6ceba246822eb3603dc69d906d36d1869d01bcdca080db325b327f242c37e791ac1fedf378845a3d797"

RPROVIDES:${PN} += "libvtk1 \
libvtkChartsCore.so.1 \
libvtkCommonColor.so.1 \
libvtkCommonComputationalGeometry.so.1 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMath.so.1 \
libvtkCommonMisc.so.1 \
libvtkCommonSystem.so.1 \
libvtkCommonTransforms.so.1 \
libvtkDICOMParser.so.1 \
libvtkDomainsChemistry.so.1 \
libvtkDomainsChemistryOpenGL2.so.1 \
libvtkFiltersAMR.so.1 \
libvtkFiltersCellGrid.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersFlowPaths.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeneric.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersGeometryPreview.so.1 \
libvtkFiltersHybrid.so.1 \
libvtkFiltersHyperTree.so.1 \
libvtkFiltersImaging.so.1 \
libvtkFiltersModeling.so.1 \
libvtkFiltersParallel.so.1 \
libvtkFiltersParallelDIY2.so.1 \
libvtkFiltersParallelImaging.so.1 \
libvtkFiltersParallelStatistics.so.1 \
libvtkFiltersParallelVerdict.so.1 \
libvtkFiltersPoints.so.1 \
libvtkFiltersProgrammable.so.1 \
libvtkFiltersReduction.so.1 \
libvtkFiltersSMP.so.1 \
libvtkFiltersSelection.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersStatistics.so.1 \
libvtkFiltersTemporal.so.1 \
libvtkFiltersTensor.so.1 \
libvtkFiltersTexture.so.1 \
libvtkFiltersTopology.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkGeovisCore.so.1 \
libvtkIOAMR.so.1 \
libvtkIOAsynchronous.so.1 \
libvtkIOAvmesh.so.1 \
libvtkIOCGNSReader.so.1 \
libvtkIOCONVERGECFD.so.1 \
libvtkIOCellGrid.so.1 \
libvtkIOCesium3DTiles.so.1 \
libvtkIOChemistry.so.1 \
libvtkIOCityGML.so.1 \
libvtkIOCore.so.1 \
libvtkIOERF.so.1 \
libvtkIOEnSight.so.1 \
libvtkIOEngys.so.1 \
libvtkIOExodus.so.1 \
libvtkIOExport.so.1 \
libvtkIOExportPDF.so.1 \
libvtkIOFDS.so.1 \
libvtkIOFLUENTCFF.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOH5Rage.so.1 \
libvtkIOH5part.so.1 \
libvtkIOHDF.so.1 \
libvtkIOIOSS.so.1 \
libvtkIOImage.so.1 \
libvtkIOImport.so.1 \
libvtkIOInfovis.so.1 \
libvtkIOLANLX3D.so.1 \
libvtkIOLSDyna.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOMINC.so.1 \
libvtkIOMotionFX.so.1 \
libvtkIOMovie.so.1 \
libvtkIONetCDF.so.1 \
libvtkIOOMF.so.1 \
libvtkIOOggTheora.so.1 \
libvtkIOPIO.so.1 \
libvtkIOPLY.so.1 \
libvtkIOParallel.so.1 \
libvtkIOParallelExodus.so.1 \
libvtkIOParallelLSDyna.so.1 \
libvtkIOParallelXML.so.1 \
libvtkIOSQL.so.1 \
libvtkIOSegY.so.1 \
libvtkIOTRUCHAS.so.1 \
libvtkIOTecplotTable.so.1 \
libvtkIOVPIC.so.1 \
libvtkIOVeraOut.so.1 \
libvtkIOVideo.so.1 \
libvtkIOXML.so.1 \
libvtkIOXMLParser.so.1 \
libvtkIOXdmf2.so.1 \
libvtkImagingColor.so.1 \
libvtkImagingCore.so.1 \
libvtkImagingFourier.so.1 \
libvtkImagingGeneral.so.1 \
libvtkImagingHybrid.so.1 \
libvtkImagingMath.so.1 \
libvtkImagingMorphological.so.1 \
libvtkImagingSources.so.1 \
libvtkImagingStatistics.so.1 \
libvtkImagingStencil.so.1 \
libvtkInfovisCore.so.1 \
libvtkInfovisLayout.so.1 \
libvtkInteractionImage.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkJava.so.1 \
libvtkParallelCore.so.1 \
libvtkParallelDIY.so.1 \
libvtkRenderingAnnotation.so.1 \
libvtkRenderingCellGrid.so.1 \
libvtkRenderingContext2D.so.1 \
libvtkRenderingContextOpenGL2.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingFreeType.so.1 \
libvtkRenderingFreeTypeFontConfig.so.1 \
libvtkRenderingGridAxes.so.1 \
libvtkRenderingHyperTreeGrid.so.1 \
libvtkRenderingImage.so.1 \
libvtkRenderingLOD.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingMatplotlib.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkRenderingParallel.so.1 \
libvtkRenderingSceneGraph.so.1 \
libvtkRenderingUI.so.1 \
libvtkRenderingVRModels.so.1 \
libvtkRenderingVolume.so.1 \
libvtkRenderingVolumeAMR.so.1 \
libvtkRenderingVolumeOpenGL2.so.1 \
libvtkRenderingVtkJS.so.1 \
libvtkTestingCore.so.1 \
libvtkTestingRendering.so.1 \
libvtkViewsContext2D.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtkWebCore.so.1 \
libvtkWebGLExporter.so.1 \
libvtkWrappingTools.so.1 \
libvtkexodusII.so.1 \
libvtkfmt.so.1 \
libvtkglad.so.1 \
libvtkh5hut.so.1 \
libvtkioss.so.1 \
libvtkjsoncpp.so.1 \
libvtkkissfft.so.1 \
libvtklibproj.so.1 \
libvtkloguru.so.1 \
libvtkmetaio.so.1 \
libvtkscn.so.1 \
libvtksys.so.1 \
libvtktoken.so.1 \
libvtkvpic.so.1 \
libvtkx11.so.1 \
libvtkxdmf2.so.1 \
vtk"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcgns.so.4.4 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libhpdf.so.2.4 \
libjpeg.so.8 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libnetcdf.so.22 \
libogg.so.0 \
libpng16.so.16 \
libpugixml.so.1 \
libpython3.13.so.1.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
libtiff.so.6 \
libverdict.so.1.4 \
libvtkPythonInterpreter.so.1 \
libvtkWrappingPythonCore3.13.so.1 \
libxml2.so.16 \
libz.so.1"

inherit rpm
