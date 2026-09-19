SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "8.4.2"

RPM_NAME = "libgsequencer0-8.4.2-1.2.aarch64.rpm"
RPM_HASH = "ae4f61c085f737f21bbf7bf8660d7134d7810f46147582cc448f1ad03cc6636d3a2fd67e679bb4a91f5556eed43c07952763f629f38c7366135a7dedddeb6732"

RPROVIDES:${PN} += "libgsequencer.so.0 \
libgsequencer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libags-audio.so.8 \
libags-gui.so.8 \
libags-server.so.8 \
libags-thread.so.8 \
libags.so.8 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libinstpatch-1.0.so.2 \
libjack.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpoppler-glib.so.8 \
libpulse.so.0 \
libxml2.so.16"

inherit rpm
