SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "8.4.2"

RPM_NAME = "libags8-8.4.2-1.2.aarch64.rpm"
RPM_HASH = "a2b58fef25d1e743eb7c40dd5f011576517704064603bb67acf0b02ff3d211f71ccd1a4a698afd28f98cc01a7cf86e58a7e55665dcb9235b082774a1e406a1b8"

RPROVIDES:${PN} += "libags-audio.so.8 \
libags-gui.so.8 \
libags-server.so.8 \
libags-thread.so.8 \
libags.so.8 \
libags8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcrypt.so.1 \
libfftw3.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libinstpatch-1.0.so.2 \
libjack.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libsoup-3.0.so.0 \
libuuid.so.1 \
libxml2.so.16"

inherit rpm
