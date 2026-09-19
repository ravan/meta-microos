SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python314-espeak-0.5-7.6.aarch64.rpm"
RPM_HASH = "33aebba95f6b1c2d48ef3f7b62938f98cc5a40991176c985517e1c5f9ce7fdd4e61b70d690c120089ca3ef001635742e9b18e293d8d1c01ba6bb0c1f0bc1a5cf"

RPROVIDES:${PN} += "python3.14dist-python-espeak \
python314-espeak \
python3dist-python-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak.so.1 \
python-abi"

inherit rpm
