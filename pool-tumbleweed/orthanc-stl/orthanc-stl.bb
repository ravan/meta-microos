SUMMARY = "Plugin to provide support for DICOM STL in Orthanc"
DESCRIPTION = "plugin to provide support for DICOM STL in Orthanc (Encapsulated 3D Manufacturing Model IODs)"
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "orthanc-stl-1.2-4.4.aarch64.rpm"
RPM_HASH = "c08f873e29e0d7d41e0d4bf121ecc85eae188f9be0a4e0913f62bea032301b893e2f3300e375016ad6482f553b6509c1214bb1376a8f6aab12cc106baf04d0aa"

RPROVIDES:${PN} += "libOrthancSTL.so.1.2 \
orthanc-stl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libdcmdata.so.20 \
libdcmjpeg.so.20 \
libdcmjpls.so.20 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libofstd.so.20 \
libstdc++.so.6 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMisc.so.1 \
libvtkFiltersCore.so.1 \
libvtkImagingCore.so.1 \
libvtksys.so.1 \
libz.so.1 \
orthanc"

inherit rpm
