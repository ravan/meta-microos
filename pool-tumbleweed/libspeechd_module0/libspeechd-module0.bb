SUMMARY = "Library for creating speech-dispatcher modules"
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

RPM_NAME = "libspeechd_module0-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "f49374b2e577ebbb9d81716b2928fc83ce1ffe0b9f6b7462412d1ed90436dff793f313723ba1a6b0a3d3b0d4281ff6144f8de12686ca52b73797e47921c51744"

RPROVIDES:${PN} += "libspeechd-module.so.0 \
libspeechd-module0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
