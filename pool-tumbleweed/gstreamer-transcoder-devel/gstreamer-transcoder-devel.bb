SUMMARY = "Development files for the GStreamer Transcoding API"
DESCRIPTION = "This subpackage contains the header files needed to build applications \
making use of the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-transcoder-devel-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "5d42718b851768513f904b73e4767d45f986f980566fb29eb36f20fab398dc7c78f4f0904851d4f7824d83f290a1f13426bd19e974ebc016eb7274a9586f08fe"

RPROVIDES:${PN} += "gstreamer-transcoder-devel \
pkgconfig-gstreamer-transcoder-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-devel \
gstreamer-plugins-bad \
gstreamer-plugins-bad-devel \
libgsttranscoder-1-0-0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
typelib-1-0-GstTranscoder-1-0"

inherit rpm
