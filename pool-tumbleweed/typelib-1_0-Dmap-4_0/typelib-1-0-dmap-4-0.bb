SUMMARY = "Typelib for libdmapsharing"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.14"

RPM_NAME = "typelib-1_0-Dmap-4_0-3.9.14-1.3.aarch64.rpm"
RPM_HASH = "98e75c2e0a43dc3fd8534b1e30a7b763a2999fef0ffdcaf9aa3db63bec90434bf77bbcd1ffec9e850863a7e22351efed2d5d73c1e41297db900d93385f01c38e"

RPROVIDES:${PN} += "typelib-1-0-Dmap-4-0 \
typelib-Dmap"

RDEPENDS:${PN} += "libdmapsharing-4.0.so.3 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-Soup"

inherit rpm
