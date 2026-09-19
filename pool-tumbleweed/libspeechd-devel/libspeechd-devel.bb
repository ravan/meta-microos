SUMMARY = "Device independent layer for speech synthesis - Development files"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.1"

RPM_NAME = "libspeechd-devel-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "d3d29cf3893360fab77317fcb2dd2239b5e1c6a4349db0f45f91208090a9dc8dae661bb25de9a9c1e141b4a377da5568cf2db544c6c319491d840f311364083e"

RPROVIDES:${PN} += "libspeechd-devel \
pkgconfig-speech-dispatcher \
speech-dispatcher-devel \
speechd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeechd2 \
pkgconfig-glib-2.0"

inherit rpm
