SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python313-espeak-0.5-7.6.aarch64.rpm"
RPM_HASH = "37aae5ba6f0b5f59b661c75bdbe48dbf5fee1967d769262dcfca7fe3d271fcc4f8e68f55fff5887f59f13906878dc534084eb3869d152efeaebb553a664bf114"

RPROVIDES:${PN} += "python3-espeak \
python3.13dist-python-espeak \
python313-espeak \
python3dist-python-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak.so.1 \
python-abi"

inherit rpm
