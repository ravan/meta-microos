SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.18.1"

RPM_NAME = "python313-ufoLib2-0.18.1-1.4.noarch.rpm"
RPM_HASH = "5dd9785bcc532e5ed9467daeb3e1f441235a027121873ae4c06154230fef57550720efa811ba9854cc01fcc4648134c4180cd7a2c176b4cc932b338c310079ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufoLib2 \
python3.13dist-ufolib2 \
python313-ufoLib2 \
python3dist-ufolib2"

RDEPENDS:${PN} += "python-abi \
python313-FontTools \
python313-attrs \
python313-fs"

inherit rpm
