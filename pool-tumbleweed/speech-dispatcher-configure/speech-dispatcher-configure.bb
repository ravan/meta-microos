SUMMARY = "Configuration tool for Speech Dispatcher"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem. \
 \
This package contains spd-conf, a configuration tool for Speech \
Dispatcher."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.12.1"

RPM_NAME = "speech-dispatcher-configure-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "12c8b4e7bcb36c5e63eb64e93482f6ba8b3747c8f934fe7d7f0c0712fe58807b3972f1b50a8c7285813d168656d5619fb90ef1df4de5a7eae5cd8ef6d68b154c"

RPROVIDES:${PN} += "speech-dispatcher-configure"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-pyxdg \
python313-speechd \
speech-dispatcher"

inherit rpm
