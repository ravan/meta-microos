SUMMARY = "An astronomical image processing software for Linux. (IRIS clone)"
DESCRIPTION = "Siril is meant to be Iris for Linux (sirI-L). It is an astronomical image \
processing tool, able to convert, pre-process images, help aligning them \
automatically or manually, stack them and enhance final images."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "1.4.4"

RPM_NAME = "siril-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "aa865908932c68a8b12dbd38edc6ab29a46d80365daf4b3b9f5c4e50ba274ee024a29f9b6187d43949482c7413554a36b39927813c570d821c041c13ec3f6d38"

RPROVIDES:${PN} += "siril"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXISF.so.0 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcairo.so.2 \
libcfitsio.so.10 \
libcurl.so.4 \
libexiv2.so.28 \
libffms2.so.5 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgit2.so.1.9 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhealpix-cxx.so.4 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopencv-stitching.so.413 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libraw.so.25 \
librtprocess.so.0 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libtiff.so.6 \
libwcs.so.8 \
libyyjson.so.0"

inherit rpm
