SUMMARY = "GStreamer integration for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
using GStreamer and its submodules as a backend to decode streams."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "vlc-codec-gstreamer-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "72b17a395812f130a5bbbdab433bd79259ceb49625b0eda67d5c54ff1cbd46ca5a625a645c18659f84e9464b2443eaba8da4fd7d0ad98da41cf829e55a0af668"

RPROVIDES:${PN} += "libgstdecode-plugin.so \
vlc-codec-gstreamer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
