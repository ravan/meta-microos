SUMMARY = "Whole Slide Imaging for Orthanc"
DESCRIPTION = "The Orthanc project provides three official tools to support DICOM for whole-slide microscopic imaging (WSI): \
- A so-called “DICOM-izer” command-line tool that converts whole-slide images to DICOM series, following Supplement 145. \
- A plugin that extends Orthanc with a Web viewer of whole-slide images for digital pathology. \
- Another command-line tool that converts a DICOM series stored inside Orthanc, to a standard hierarchical TIFF image."
LICENSE = "AGPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "orthanc-wsi-4.0-1.1.aarch64.rpm"
RPM_HASH = "4107f7d9ec36926c05de0fd88505fe7333b272bd66a448c199f2c77d2d9843c7c8998321a8ae22d87ab60114755123860b7e5d2da95f0f29b08b95035c7ca7e2"

RPROVIDES:${PN} += "libOrthancWSI.so.4.0 \
orthanc-wsi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libdcmdata.so.20 \
libdcmimage.so.20 \
libdcmjpls.so.20 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjsoncpp.so.27 \
libm.so.6 \
libofstd.so.20 \
libopenjp2.so.7 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libuuid.so.1 \
libz.so.1 \
orthanc"

inherit rpm
