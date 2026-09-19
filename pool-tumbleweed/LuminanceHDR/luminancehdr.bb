SUMMARY = "Complete workflow for HDR imaging"
DESCRIPTION = "Luminance HDR is a graphical user interface (based on the Qt5 toolkit) that provides a complete workflow for HDR imaging. \
Supported HDR formats: \
  * OpenEXR (extension: exr) \
  * Radiance RGBE (extension: hdr) \
  * Tiff formats: 16bit, 32bit (float) and LogLuv (extension: tiff) \
  * Raw image formats (extension: various) \
  * PFS native format (extension: pfs) \
 \
Supported LDR formats: \
  * JPEG, PNG, PPM, PBM, TIFF, FITS \
 \
Supported features: \
  * Create an HDR file from a set of images (JPEG, TIFF 8bit and 16bit, RAW) of the same scene taken at different exposure setting \
  * Save and load HDR files \
  * Rotate and resize HDR files \
  * Tonemap HDR images \
  * Projective Transformations \
  * Copy EXIF data between sets of images \
  * Supports internationalization"
LICENSE = "GPL-3.0-or-later"

PV = "2.6.0+git313.634b489"

RPM_NAME = "LuminanceHDR-2.6.0+git313.634b489-4.1.aarch64.rpm"
RPM_HASH = "7a706dac8c766ec9d21691bb0387fd9cefebcd0d1c61dfa631dae0487763f31d4d5da32983e2c7f6d9ef77ae20c4a72bc18f0da98ac47e1df1f3ce6c8a4a5967"

RPROVIDES:${PN} += "LuminanceHDR"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.28 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libjpeg.so.8 \
liblcms2-2 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libraw-r.so.25 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
