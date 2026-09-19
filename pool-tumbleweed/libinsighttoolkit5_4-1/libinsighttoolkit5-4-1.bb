SUMMARY = "Toolkit for scientific image processing, segmentation, and registration"
DESCRIPTION = "The Insight Toolkit (ITK) is a toolkit for N-dimensional scientific \
image processing, segmentation, and registration. \
 \
This package provides shared libraries for ITK."
LICENSE = "Apache-2.0"

PV = "5.4.7"

RPM_NAME = "libinsighttoolkit5_4-1-5.4.7-1.1.aarch64.rpm"
RPM_HASH = "687a064df1d648a3def4db3e03d7c6f366bb6d18801a0e4bbd17d147e1961bdf6add96c1f91fa93e0445fe204ad28cbfe326bdf1ad6dfee17118662b0f490d5e"

RPROVIDES:${PN} += "libITKBiasCorrection-5.4.so.1 \
libITKColormap-5.4.so.1 \
libITKCommon-5.4.so.1 \
libITKConvolution-5.4.so.1 \
libITKDICOMParser-5.4.so.1 \
libITKDeformableMesh-5.4.so.1 \
libITKDenoising-5.4.so.1 \
libITKDiffusionTensorImage-5.4.so.1 \
libITKFFT-5.4.so.1 \
libITKFastMarching-5.4.so.1 \
libITKIOBMP-5.4.so.1 \
libITKIOBioRad-5.4.so.1 \
libITKIOBruker-5.4.so.1 \
libITKIOCSV-5.4.so.1 \
libITKIOGDCM-5.4.so.1 \
libITKIOGE-5.4.so.1 \
libITKIOGIPL-5.4.so.1 \
libITKIOHDF5-5.4.so.1 \
libITKIOIPL-5.4.so.1 \
libITKIOImageBase-5.4.so.1 \
libITKIOJPEG-5.4.so.1 \
libITKIOJPEG2000-5.4.so.1 \
libITKIOLSM-5.4.so.1 \
libITKIOMINC-5.4.so.1 \
libITKIOMRC-5.4.so.1 \
libITKIOMeshBYU-5.4.so.1 \
libITKIOMeshBase-5.4.so.1 \
libITKIOMeshFreeSurfer-5.4.so.1 \
libITKIOMeshGifti-5.4.so.1 \
libITKIOMeshOBJ-5.4.so.1 \
libITKIOMeshOFF-5.4.so.1 \
libITKIOMeshVTK-5.4.so.1 \
libITKIOMeta-5.4.so.1 \
libITKIONIFTI-5.4.so.1 \
libITKIONRRD-5.4.so.1 \
libITKIOPNG-5.4.so.1 \
libITKIOSiemens-5.4.so.1 \
libITKIOSpatialObjects-5.4.so.1 \
libITKIOStimulate-5.4.so.1 \
libITKIOTIFF-5.4.so.1 \
libITKIOTransformBase-5.4.so.1 \
libITKIOTransformHDF5-5.4.so.1 \
libITKIOTransformInsightLegacy-5.4.so.1 \
libITKIOTransformMatlab-5.4.so.1 \
libITKIOVTK-5.4.so.1 \
libITKIOXML-5.4.so.1 \
libITKImageFeature-5.4.so.1 \
libITKImageIntensity-5.4.so.1 \
libITKKLMRegionGrowing-5.4.so.1 \
libITKLabelMap-5.4.so.1 \
libITKMarkovRandomFieldsClassifiers-5.4.so.1 \
libITKMathematicalMorphology-5.4.so.1 \
libITKMesh-5.4.so.1 \
libITKMetaIO-5.4.so.1 \
libITKNrrdIO-5.4.so.1 \
libITKOptimizers-5.4.so.1 \
libITKOptimizersv4-5.4.so.1 \
libITKPDEDeformableRegistration-5.4.so.1 \
libITKPath-5.4.so.1 \
libITKPolynomials-5.4.so.1 \
libITKQuadEdgeMesh-5.4.so.1 \
libITKQuadEdgeMeshFiltering-5.4.so.1 \
libITKRegionGrowing-5.4.so.1 \
libITKRegistrationMethodsv4-5.4.so.1 \
libITKSmoothing-5.4.so.1 \
libITKSpatialObjects-5.4.so.1 \
libITKStatistics-5.4.so.1 \
libITKTestKernel-5.4.so.1 \
libITKTransform-5.4.so.1 \
libITKTransformFactory-5.4.so.1 \
libITKVNLInstantiation-5.4.so.1 \
libITKVTK-5.4.so.1 \
libITKVideoCore-5.4.so.1 \
libITKVideoIO-5.4.so.1 \
libITKWatersheds-5.4.so.1 \
libITKgiftiio-5.4.so.1 \
libITKniftiio-5.4.so.1 \
libITKznz-5.4.so.1 \
libinsighttoolkit5-4-1 \
libitkNetlibSlatec-5.4.so.1 \
libitkdouble-conversion-5.4.so.1 \
libitklbfgs-5.4.so.1 \
libitkminc2-5.4.so.1 \
libitkopenjpeg-5.4.so.1 \
libitksys-5.4.so.1 \
libitktestlib-5.4.so.1 \
libitkv3p-netlib-5.4.so.1 \
libitkvcl-5.4.so.1 \
libitkvnl-5.4.so.1 \
libitkvnl-algo-5.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdcmDICT.so.3.2 \
libgdcmDSED.so.3.2 \
libgdcmMSFF.so.3.2 \
libhdf5-cpp.so.310 \
libhdf5.so.310 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
