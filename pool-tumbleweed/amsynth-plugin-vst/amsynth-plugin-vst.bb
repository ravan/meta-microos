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
This package includes the VST implementation of the synthesizer."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "amsynth-plugin-vst-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "04c3ceb3a2ea4616ff3515e9fdcce07b080b85c6d5c006c3a832dd552a1e352a7f797004d55915c5967a8f89e3c71ffc8f3eed51444f82bb9a8719e317e57013"

RPROVIDES:${PN} += "amsynth-plugin-vst"

RDEPENDS:${PN} += "amsynth \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
