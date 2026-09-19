SUMMARY = "Library implementing the DMAP family of protocols - Development Files"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos. \
 \
This package contains development files for libdmapsharing."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.14"

RPM_NAME = "libdmapsharing-devel-3.9.14-1.3.aarch64.rpm"
RPM_HASH = "12c253540131c75b58332ee670f58b653c2474f9a6eed34f3ec5a21eb47c53261ee28b8b8cb5db213c7276d92dbbd1a0412b05b310fd427a480007aa3c5a3daf"

RPROVIDES:${PN} += "libdmapsharing-devel \
pkgconfig-libdmapsharing-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmapsharing-4-0-3 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-Dmap-4-0"

inherit rpm
