SUMMARY = "Point Data Abstraction Library (GDAL for point cloud data)"
DESCRIPTION = "PDAL is a C++ BSD library for translating and manipulating point cloud data. \
It is very much like the GDAL library which handles raster and vector data. \
 \
In addition to the library code, PDAL provides a suite of command-line \
applications that users can conveniently use to process, filter, translate, \
and query point cloud data. See Applications for more information. \
 \
PDAL should not be confused with PCL (Point Cloud Library). \
PCL is a library specifically designed to provide algorithmic analysis and \
modification of point clouds. PDAL provides a limited interface to the PCL's \
facilities, but does not in general attempt to duplicate its capabilites. \
PDAL is focused more on data access and translation than PCL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.10.2"

RPM_NAME = "libPDAL20-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "f8130654d92cc5fd419249765d8aa543bfdf9e5d5ecaf5d2a5ec3651c0c102bb1d732c969a8dfbdf5131bfd160e319a74c73360e8c56cc92ecad81b918966c2a"

RPROVIDES:${PN} += "libPDAL20 \
libpdal-plugin-kernel-fauxplugin.so.20 \
libpdal-plugin-reader-pgpointcloud.so.20 \
libpdal-plugin-writer-pgpointcloud.so.20 \
libpdalcpp.so.20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgdal.so.39 \
libgeotiff.so.5 \
liblzma.so.5 \
libm.so.6 \
libpq.so.5 \
libproj.so.25 \
libstdc++.so.6 \
libunwind.so.8 \
libxml2.so.16 \
libz.so.1"

inherit rpm
