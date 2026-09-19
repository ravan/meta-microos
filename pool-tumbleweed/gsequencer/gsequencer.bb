SUMMARY = "Audio processing engine"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio \
sequencer application supporting the LADPSA, DSSI and Lv2 plugin \
formats. It can output to Pulseaudio server, JACK and ALSA. \
 \
You may add multiple sinks, mix different sources by producing \
sound with different sequencers. Furthermore, it features a pattern \
and piano roll and there is an editor to automate ports."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "8.4.2"

RPM_NAME = "gsequencer-8.4.2-1.2.aarch64.rpm"
RPM_HASH = "afc4e71cf0d2817f2bfbde4c493aa89fc388c4cf0abdfd8d3edba3a93f7977fe00d2e12626db1025a430de326c60f8df433214b652f96adadf8b2e114f3449cb"

RPROVIDES:${PN} += "gsequencer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libags-audio.so.8 \
libags.so.8 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsequencer.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libinstpatch-1.0.so.2 \
libxml2.so.16"

inherit rpm
