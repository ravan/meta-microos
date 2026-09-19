SUMMARY = "A program for viewing and analysing contents of audio files"
DESCRIPTION = "Sonic Visualiser is a program for viewing and analysing the contents \
of music audio files. \
 \
With Sonic Visualiser you can: \
* Load audio files in various formats and view their waveforms \
 \
* Look at audio visualisations such as spectrogram views, with \
  interactive adjustment of display parameters \
 \
* Annotate audio data by adding labelled time points and defining \
  segments, point values and curves \
 \
* Run feature-extraction plugins to calculate annotations \
  automatically, using algorithms such as beat trackers, pitch \
  detectors and so on \
 \
* Import annotation data from various text formats and MIDI files \
 \
* Play back the original audio with synthesised annotations, taking \
  care to synchronise playback with the display position \
 \
* Slow down playback and loop segments of interest, including \
  seamless looping of complex non-contiguous areas \
 \
* Export annotations and audio selections to external files. \
 \
* Sonic Visualiser can also be controlled remotely using the Open Sound \
  Control (OSC) protocol"
LICENSE = "GPL-2.0-or-later"

PV = "5.2.1"

RPM_NAME = "sonic-visualiser-5.2.1-2.8.aarch64.rpm"
RPM_HASH = "0f33b8c2e03486bf5274cdd87d416c63cd42a3fa735ae565acfad0d6259a8d75ad6a345695fc4d5c7baabca4a120ec7c8c804d589b5c336fd2e34aae9293e8ab"

RPROVIDES:${PN} += "sonic-visualiser"

RDEPENDS:${PN} += "/usr/bin/sh \
dssi \
ladspa \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libbz2.so.1 \
libc.so.6 \
libcapnp.so.1.5.0 \
libfftw3.so.3 \
libfishsound.so.1 \
libgcc-s.so.1 \
libid3tag.so.0 \
libkj.so.1.5.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libmad.so.0 \
liboggz.so.2 \
libopusfile.so.0 \
libportaudio.so.2 \
libpulse.so.0 \
librubberband.so.3 \
libsamplerate.so.0 \
libserd-0.so.0 \
libsndfile.so.1 \
libsord-0.so.0 \
libstdc++.so.6 \
libvamp-hostsdk.so.3"

inherit rpm
