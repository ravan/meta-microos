SUMMARY = "Analog modelling (a.k.a virtual analog) software synthesizer"
DESCRIPTION = "Amsynth is an analog modelling (a.k.a virtual analog) software synthesizer. \
It mimics the operation of early analog subtractive synthesizers with \
classic oscillator waveforms, envelopes, filter, modulation and effects. \
The aim is to make it easy to create and modify sounds. \
 \
Features: \
 * Dual oscillators (sine / saw / square / noise) with hard sync \
 * 12/24 dB/oct resonant filter (low-pass / high-pass / band-pass / notch) \
 * Mono / poly / legato keyboard modes \
 * Dual ADSR envelope generators (filter & amplitude) \
 * LFO which can modulate the oscillators, filter, and amplitude \
 * Distortion and reverb \
 * Hundreds of presets \
 \
There are currently several different ways to run amsynth: \
 * Stand-alone application using JACK, ALSA or OSS \
 * DSSI plug-in \
 * LV2 plug-in \
 * VST plug-in \
 \
This package includes the DSSI implementation of the synthesizer."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "amsynth-plugin-dssi-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "fc419c9b685833a512d3aadad2b7ed58d325d2a6e5100227d1f396943dc39a0396c21adf26a249c0a99b5acc3678dd3cf5378539d9269f07885882fb400bc184"

RPROVIDES:${PN} += "amsynth-plugin-dssi"

RDEPENDS:${PN} += "amsynth \
dssi \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
liblo.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
