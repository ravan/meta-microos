SUMMARY = "Clean and Lean GNOME CD Ripper"
DESCRIPTION = "GStreamer-based CD ripping tool. Saves audio CDs to Ogg/vorbis."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "sound-juicer-3.40.0-3.6.aarch64.rpm"
RPM_HASH = "94273e47bc1dee961eecbc3d13ffcb47819a475d96351c7f54bcf15b8754a64d6ff665752e3a11cbd9180457c449efdf2636df217e7f7f414b2b4c7f0c12937c"

RPROVIDES:${PN} += "sound-juicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrasero-media3.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libdiscid.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0"

inherit rpm
