SUMMARY = "Python bindings for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides python 3.x bindings for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.6.1"

RPM_NAME = "python3-vtk-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "5284ff26b3f86799c10604b294fcb990424b5a686550e01678cec535fd2e901080d61388642fba3b02d6d0ed6b2a958d4a9811a340ce3e5ad9bdf49a6bdcbb52"

RPROVIDES:${PN} += "libvtkCommonPython.so.1 \
libvtkFiltersPython.so.1 \
libvtkPythonContext2D.so.1 \
libvtkPythonInterpreter.so.1 \
libvtkWrappingPythonCore3.13.so.1 \
python3-vtk \
python3.13dist-vtk \
python3dist-vtk"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libvtk1 \
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
libvtkParallelCore.so.1 \
libvtkRenderingAnnotation.so.1 \
libvtkRenderingCellGrid.so.1 \
libvtkRenderingContext2D.so.1 \
libvtkRenderingContextOpenGL2.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingFreeType.so.1 \
libvtkRenderingGridAxes.so.1 \
libvtkRenderingHyperTreeGrid.so.1 \
libvtkRenderingImage.so.1 \
libvtkRenderingLOD.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingMatplotlib.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkRenderingParallel.so.1 \
libvtkRenderingQt.so.1 \
libvtkRenderingSceneGraph.so.1 \
libvtkRenderingUI.so.1 \
libvtkRenderingVRModels.so.1 \
libvtkRenderingVolume.so.1 \
libvtkRenderingVolumeAMR.so.1 \
libvtkRenderingVolumeOpenGL2.so.1 \
libvtkRenderingVtkJS.so.1 \
libvtkTestingRendering.so.1 \
libvtkViewsContext2D.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtkWebCore.so.1 \
libvtkWebGLExporter.so.1 \
libvtkfmt.so.1 \
libvtkscn.so.1 \
libvtksys.so.1 \
libvtktoken.so.1 \
python-abi \
python3-numpy \
python3-qt5 \
vtk-qt"

inherit rpm
