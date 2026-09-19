SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python313-sadisplay-0.4.9-3.5.noarch.rpm"
RPM_HASH = "64adc908a931113161e518421e59bf4184d7319b7511afc38e9ca14a454f453565b70c4e25e48e15886087b3ef4cdc43ddcb21b26d9a7a9158639381a93dfc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sadisplay \
python3.13dist-sadisplay \
python313-sadisplay \
python3dist-sadisplay"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-SQLAlchemy"

inherit rpm
