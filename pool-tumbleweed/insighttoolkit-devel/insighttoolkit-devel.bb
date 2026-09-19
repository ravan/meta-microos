SUMMARY = "Development files for ITK"
DESCRIPTION = "The Insight Toolkit (ITK) is a toolkit for N-dimensional scientific \
image processing, segmentation, and registration. \
 \
This package provides development files for the ITK library."
LICENSE = "Apache-2.0"

PV = "5.4.7"

RPM_NAME = "insighttoolkit-devel-5.4.7-1.1.aarch64.rpm"
RPM_HASH = "3d0332f756de7c4428694edd4e45e16ad42ed1a6a0f233f0bbec6a1a02dc26ca6e39c70d59c1ad8e9329a54d0e57c68bf45b2390f4740a04f9b54956634f36fe"

RPROVIDES:${PN} += "cmake-ITK \
insighttoolkit-devel \
libinsighttoolkit-devel"

RDEPENDS:${PN} += "dcmtk-devel \
double-conversion-devel \
fftw3-threads-devel \
hdf5-devel \
ld-linux-aarch64.so.1 \
libITKCommon-5.4.so.1 \
libITKTestKernel-5.4.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libinsighttoolkit5-4-1 \
libitksys-5.4.so.1 \
libitkvnl-5.4.so.1 \
libstdc++.so.6 \
pkgconfig-expat \
pkgconfig-fftw3 \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib \
vtk-devel"

inherit rpm
