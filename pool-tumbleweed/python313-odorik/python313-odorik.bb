SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python313-odorik-0.5-7.10.noarch.rpm"
RPM_HASH = "6894677660b55fe21b6b6070c29fe2a249a09d15deab8c88b57446ae498be7e5ae782edafe61afdec2c65b7e5063d2bad18d40add3dd73837f7c296062c84721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-odorik \
python3.13dist-odorik \
python313-odorik \
python3dist-odorik"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-python-dateutil \
python313-xdg \
update-alternatives"

inherit rpm
