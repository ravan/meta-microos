SUMMARY = "Library implementing the Digital Media Access Protocol family"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.14"

RPM_NAME = "libdmapsharing-4_0-3-3.9.14-1.3.aarch64.rpm"
RPM_HASH = "9fb34354dcd715c2946e166b3462c57f761635a9205b225ffe07352c4221347e9e6cd20906d343592221bf535d3d176bdd700ebf62eb25acd2e53aaa831ea9c5"

RPROVIDES:${PN} += "libdmapsharing-4-0-3 \
libdmapsharing-4.0.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libsoup-3.0.so.0 \
libz.so.1"

inherit rpm
