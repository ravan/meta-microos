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
 * VST plug-in"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "amsynth-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "3a3753a742c79d3dc689b952816b5d61bd9b0fe7ae68ed86228a65356bb8aff38c49b3b31595d5cb7a04c6447e327cf502fadaacd5f63e3409cb3f98232a09cb"

RPROVIDES:${PN} += "amsynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
