SUMMARY = "A Java image processing program"
DESCRIPTION = "ImageJ is a multithreaded image processing program inspired by NIH \
Image for the Macintosh, running either as an applet or as a \
standalone program. \
 \
It can read many image formats including TIFF, GIF, JPEG, BMP, DICOM, \
FITS and 'raw', and display, edit, anazlye, process and print \
8/16/32-bit images. It supports 'stacks', a series of images that \
share a single window. It can calculate area and pixel value \
statistics of user-defined selections, measure distances and angles, \
create density histograms and line profile plots, supports standard \
image processing functions such as contrast manipulation, sharpening, \
smoothing, edge detection and median filtering. It does geometric \
transformations such as scaling, rotation and flips. Zoom in/out up \
to 32:1/1:32. Spatial calibration is available to provide real-world \
dimensional measurements in units such as millimeters. Density or \
gray scale calibration is also available. \
 \
ImageJ can be extended via Java plugins, and has a built-in editor and \
compiler."
LICENSE = "SUSE-Public-Domain"

PV = "1.53u"

RPM_NAME = "imagej-1.53u-1.8.noarch.rpm"
RPM_HASH = "abf17f5f27768c11cae6b9f4f6c14d6eb6926e8d1881419a2462de1c1a3ccc03278aac9a7cd87c848f95beca8aad22392ea1f4b12a90799c313416386059901a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imagej"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
