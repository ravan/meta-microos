SUMMARY = "FITS and XISF image viewer, converter and indexer"
DESCRIPTION = "RAW/FITS/XISF image viewer with multithreaded image loading. \
Features included, but not limited to: \
* FITS 8, 16 bit integer and 32 bit float \
* XISF 8, 16 bit integer and 32 bit float \
* JPEG and PNG images \
* NEF, CR2 and DNG raw files \
* Using same stretch function as PixInsight \
* OpenGL accelerated drawing \
* Index and search FITS XISF header data \
* Quick mark images and then copy/move marked files \
* Convert FITS <-> XISF \
* Convert FITS/XISF -> JPEG/PNG \
* Image statistics mean, media, min, max"
LICENSE = "GPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "tenmon-20260826-1.1.aarch64.rpm"
RPM_HASH = "fdcedc6d8fedd3ead044fa7501d440dc2cb6e18467723b5be8f9ae62ee639be590c1c1dbb98c1a4e9909c884e0af8e6120bcc81dc7a4e3898b75cbbbec1457da"

RPROVIDES:${PN} += "tenmon"

RDEPENDS:${PN} += "libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libXISF.so.0 \
libc.so.6 \
libcfitsio.so.10 \
libexif.so.12 \
libgcc-s.so.1 \
liblcms2.so.2 \
libm.so.6 \
libraw-r.so.25 \
libstdc++.so.6 \
libwcs.so.8 \
libzstd.so.1"

inherit rpm
