SUMMARY = "A KDE Software for Music Education"
DESCRIPTION = "Application for Music Education. \
 \
Minuet aims at supporting students and teachers in many aspects \
of music education, such as ear training, first-sight reading, \
solfa, scales, rhythm, harmony, and improvisation. \
Minuet makes extensive use of MIDI capabilities to provide a \
full-fledged set of features regarding volume, tempo, and pitch \
changes, which makes Minuet a valuable tool for both novice and \
experienced musicians."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "minuet-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f29019957543c2b1fe29aff2e0d39ca9398299ed1a96b2f30fa51f7fec77a449cc0b8334f33feba0c9803fac6475e70e8d654f2502789e6a1f9894113f4eeec9"

RPROVIDES:${PN} += "libminuetinterfaces.so.0.3.0 \
minuet"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcoreaddons-imports \
kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libaubio.so.5 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
