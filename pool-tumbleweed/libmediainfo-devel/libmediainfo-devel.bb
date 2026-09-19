SUMMARY = "Header files for libmediainfo"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
This subpackage contains the C API header definitions."
LICENSE = "BSD-2-Clause"

PV = "26.05"

RPM_NAME = "libmediainfo-devel-26.05-1.3.aarch64.rpm"
RPM_HASH = "b4235962faf049bd996ab5f0921d487e3ac37fc7557f5b157c063fa24bbbba6cab36910bf0f854ffa66e3dda69d41df8f0d601a8cc6f2d7b604b3ae23ab555b9"

RPROVIDES:${PN} += "libmediainfo-devel \
pkgconfig-libmediainfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmediainfo0 \
pkgconfig-libcurl \
pkgconfig-libzen"

inherit rpm
