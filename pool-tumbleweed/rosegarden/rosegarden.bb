SUMMARY = "Midi, Audio And Notation Editor"
DESCRIPTION = "Rosegarden is a well-rounded audio and MIDI sequencer, \
score editor, and general-purpose music composition and \
editing environment. Rosegarden is an easy-to-learn, \
attractive application that runs on Linux, ideal for \
composers, musicians, music students, and small studio or \
home recording environments."
LICENSE = "GPL-2.0-or-later"

PV = "26.06"

RPM_NAME = "rosegarden-26.06-1.2.aarch64.rpm"
RPM_HASH = "d017771e486c359d66cc11b3ba98ded86fbf5aa1a5c11e9bae1a140b853fafb0e08b58d073098aaa25aa02da2b5e7f74dc1d73c23033f321f6d17cf4c59a6cac"

RPROVIDES:${PN} += "rosegarden"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/ruby \
/usr/bin/sh \
dssi \
ladspa \
ladspa-swh-plugins \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
liblilv-0.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libz.so.1 \
lilypond-fonts-common \
xsynth-dssi"

inherit rpm
