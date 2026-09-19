SUMMARY = "Arcam AV Amplifier Plug-In for ALSA Library"
DESCRIPTION = "This package contains a control plugin to access Arcam AV amplifier device \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-arcam-av-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "90693e1b915323ae50efecd2705ff6e7678df55f1bd4b0907e2f6faaa6e34bc62352de8a9b8014ea7afb8b90e201e303c880e7ceb73d5133c46aeafe808c79c3"

RPROVIDES:${PN} += "alsa-plugins-arcam-av \
libasound-module-ctl-arcam-av.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
