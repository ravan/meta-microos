SUMMARY = "Device independent layer for speech synthesis - Python Bindings"
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

RPM_NAME = "python313-speechd-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "4fb4b68fdc47bf7ece1273dca663c60c437255df93dfbb01f62932288d1747abad5479719b2de8f75e23f59976185fb9a623b1d2caa6aa67e71d78c9c8390595"

RPROVIDES:${PN} += "python3-speechd \
python313-speechd"

RDEPENDS:${PN} += "python-abi \
speech-dispatcher"

inherit rpm
